package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyecto();
    
    public Proyecto crearProyecto(Proyecto proyect);
    
    public void borrarProyecto(Long id);
    
    public void modificarProyecto(Proyecto proyect);
    
}
