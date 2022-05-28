package com.Portfolio.Portfolio.Controller;

import com.Portfolio.Portfolio.model.Educacion;
import com.Portfolio.Portfolio.service.IEducacionService;
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
public class EducacionController {
    
   @Autowired
    private IEducacionService eduService;
    
    @PostMapping("/new/educacion")
    public Educacion agregarEducacion(@RequestBody Educacion edu){
       return eduService.crearEducacion(edu);        
    }
    
    @GetMapping("ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduService.verEducacion();
    }
    
    @DeleteMapping("del/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduService.borrarEducacion(id);
    }
    
    @PutMapping("mod/educacion")
    public void modificarEducacion(@RequestBody Educacion edu){
        eduService.modificarEducacion(edu);
    }
}
