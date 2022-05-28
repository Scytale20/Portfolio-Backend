package com.Portfolio.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Info {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)       
    Long id;
    
    @Lob
    String info;

    public Info() {
    }

    public Info(Long id, String info) {
        this.id = id;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Info{" + "id=" + id + ", info=" + info + '}';
    }
    
    
    
    
    
}
