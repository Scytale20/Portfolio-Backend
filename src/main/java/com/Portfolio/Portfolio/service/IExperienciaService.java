package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public Experiencia crearExperiencia(Experiencia exp);
    
    public void borrarExperiencia(Long id);
    
    public void buscarExperiencia(Long id);
    
    public void modificarExperiencia(Experiencia exp);
    
}
