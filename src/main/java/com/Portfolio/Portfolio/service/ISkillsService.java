
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Skills;
import java.util.List;


public interface ISkillsService {
    
   public List<Skills> verSkills();
   
   public Skills crearSkill(Skills skill);
   
   public void borrarSkill(Long id);
   
   public void buscarSkill(Long id);
   
   public void modificarSkill (Skills skill);
    
}
