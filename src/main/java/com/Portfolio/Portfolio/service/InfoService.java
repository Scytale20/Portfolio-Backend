package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Info;
import com.Portfolio.Portfolio.repository.InfoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService implements IInfoService{
    
    @Autowired
    InfoRepository infoRepo;

    @Override
    public List<Info> verInfo() {
      return infoRepo.findAll();
    }

    @Override
    public void crearInfo(Info info) {
        infoRepo.save(info);
    }

    @Override
    public void modificarInfo(Info info) {
        infoRepo.save(info);
    }
    
}
