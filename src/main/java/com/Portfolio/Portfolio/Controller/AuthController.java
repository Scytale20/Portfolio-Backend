package com.Portfolio.Portfolio.Controller;

import com.Portfolio.Portfolio.model.UserDto;
import com.Portfolio.Portfolio.model.Usuario;
import com.Portfolio.Portfolio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {
    
    @Autowired
    UsuarioService userServ;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto user){
        return userServ.isEnabled(user);
    }
    
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario)throws Exception{
        userServ.crearUsuario(usuario);
    }    
}
