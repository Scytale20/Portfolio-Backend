package com.Portfolio.Portfolio.Controller;

import com.Portfolio.Portfolio.model.Experiencia;
import com.Portfolio.Portfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    
    @Autowired
    IExperienciaService expeService;
    
    @PostMapping ("/new/experiencia") 
    public Experiencia agregarExperiencia(@RequestBody Experiencia exp){
        return expeService.crearExperiencia(exp);
    }
    
    @GetMapping("ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expeService.verExperiencia();
    }
    
    @DeleteMapping("/del/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expeService.borrarExperiencia(id);
    }
    
    @PutMapping("/mod/experiencia")
    public void modificarExperiencia(@RequestBody Experiencia exp){
        expeService.modificarExperiencia(exp);
    }
}
