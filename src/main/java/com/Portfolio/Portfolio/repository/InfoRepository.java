
package com.Portfolio.Portfolio.repository;

import com.Portfolio.Portfolio.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {
    
}
