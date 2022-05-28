
package com.Portfolio.Portfolio.service;

import com.Portfolio.Portfolio.model.Skills;
import com.Portfolio.Portfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    SkillsRepository skillRepo;

    @Override
    public List<Skills> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public Skills crearSkill(Skills skill) {
        return skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public void buscarSkill(Long id) {
        skillRepo.findById(id);
    }

    @Override
    public void modificarSkill(Skills skill) {
        skillRepo.save(skill);
    }
    
    
    
}
