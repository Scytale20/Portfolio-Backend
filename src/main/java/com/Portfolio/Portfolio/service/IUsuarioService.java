
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.UserDto;
import com.Portfolio.Portfolio.model.Usuario;



public interface IUsuarioService{
    
    public boolean isEnabled(UserDto user);
    
    public void crearUsuario (Usuario usuario)throws Exception;    
   
    
}
