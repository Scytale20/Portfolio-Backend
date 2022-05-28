package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Proyecto;
import com.Portfolio.Portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    ProyectoRepository proyectRepo;
    
    @Override
    public List<Proyecto> verProyecto() {
        return proyectRepo.findAll();
    }

    @Override
    public Proyecto crearProyecto(Proyecto proyect) {
        return proyectRepo.save(proyect);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public void modificarProyecto(Proyecto proyect) {
        proyectRepo.save(proyect);
    }
    
    
    
    
}
