
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Educacion;
import com.Portfolio.Portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion edu) {
        return eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public void buscarEducacion(Long id) {
        eduRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    
}
