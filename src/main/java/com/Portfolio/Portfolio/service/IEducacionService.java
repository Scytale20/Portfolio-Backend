package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> verEducacion();
    
    public Educacion crearEducacion (Educacion edu);
    
    public void borrarEducacion (Long id);
    
    public void buscarEducacion (Long id);
    
    public void modificarEducacion (Educacion edu);    
    
}
