package com.Portfolio.Portfolio.Controller;

import com.Portfolio.Portfolio.model.Proyecto;
import com.Portfolio.Portfolio.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyectService;
    
    @GetMapping("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyectService.verProyecto();
    }
    
    @DeleteMapping("del/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectService.borrarProyecto(id);
    }
    
    @PostMapping("/new/proyecto")
    public Proyecto crearProyecto(@RequestBody Proyecto proyect){
        return proyectService.crearProyecto(proyect);
    }
    @PutMapping("/mod/proyecto")
    public void modificarProyecto(@RequestBody Proyecto proyect){
        proyectService.modificarProyecto(proyect);
    }
    
}
