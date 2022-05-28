package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Header;
import com.Portfolio.Portfolio.repository.HeaderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements IHeaderService{

    @Autowired
    HeaderRepository headRepo;
    
   

    @Override
    public void modificarHeader(Header data) {
        headRepo.save(data);
    }

    @Override
    public void crearHeader(Header data) {
         headRepo.save(data);
    }

    @Override
    public List<Header> verHeader() {
        return headRepo.findAll();
    }    
    
    
}
