
package com.Portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String skillName;
    private int percent;
    private String img;

    public Skills() {
    }

    public Skills(Long id, String skillName, int percent, String img) {
        this.id = id;
        this.skillName = skillName;
        this.percent = percent;
        this.img = img;
    }
    
    
    
}
