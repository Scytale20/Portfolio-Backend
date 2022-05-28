package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.UserDto;
import com.Portfolio.Portfolio.model.Usuario;
import com.Portfolio.Portfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    UsuarioRepository userRepo;
    
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public boolean isEnabled(UserDto user) {
        boolean isEnabled = false;
        List<Usuario> usuarios = userRepo.findByEmailAndIsEnabledTrue(user.getEmail());
        if(!usuarios.isEmpty()){
            Usuario usuario = usuarios.get(0);
            if(passwordEncoder.matches(user.getPassword(), usuario.getPassword()))
                isEnabled = true;                
        }        
        return isEnabled;
    }

    @Override
    public void crearUsuario(Usuario usuario) throws Exception {        
        List<Usuario> usuarios = userRepo.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if (!usuarios.isEmpty()){
            throw new Exception("Usuario ya registrado");  
        }else{
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            userRepo.save(usuario);
    }
    
    
    
        
    }    
}
    
