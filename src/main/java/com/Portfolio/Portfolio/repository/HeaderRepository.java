package com.Portfolio.Portfolio.repository;

import com.Portfolio.Portfolio.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository<Header, Long>{

    
    
}
