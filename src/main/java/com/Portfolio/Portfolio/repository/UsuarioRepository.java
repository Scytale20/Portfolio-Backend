package com.Portfolio.Portfolio.repository;

import com.Portfolio.Portfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

    
    List<Usuario>findByEmailAndIsEnabledTrue(String email);
    
}
