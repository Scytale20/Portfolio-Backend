
package com.Portfolio.Portfolio.Controller;

import com.Portfolio.Portfolio.model.Skills;
import com.Portfolio.Portfolio.service.ISkillsService;
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
public class SkillsController {
    
    @Autowired
    private ISkillsService skillServ;
    
    @PostMapping("new/skill")
    public Skills agregarSkill(@RequestBody Skills skill){
        return skillServ.crearSkill(skill);
    }
    @GetMapping("ver/skill")
    @ResponseBody
    public List<Skills> verSkills(){
       return skillServ.verSkills();
    } 
    @DeleteMapping("del/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    
    @PutMapping("mod/skill")
    public void modificarSkill(@RequestBody Skills skill){
        skillServ.modificarSkill(skill);
    }
    
    
    
    
    
}
