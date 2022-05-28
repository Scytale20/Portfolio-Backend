package com.Portfolio.Portfolio.repository;

import com.Portfolio.Portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>  {
    
}
