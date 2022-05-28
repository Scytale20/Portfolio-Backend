
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Experiencia;
import com.Portfolio.Portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public Experiencia crearExperiencia(Experiencia exp) {
        return expeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public void buscarExperiencia(Long id) {
        expeRepo.findById(id);
    }

    @Override
    public void modificarExperiencia(Experiencia exp) {
        expeRepo.save(exp);
    }
    
}
