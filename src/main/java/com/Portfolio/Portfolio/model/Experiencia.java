package com.Portfolio.Portfolio.model;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String empresa;
    private String task;
    private String img;
    private String fechaStart;    
    private String fechaEnd;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String task, String img, String fechaStart, String fechaEnd) {
        this.id = id;
        this.empresa = empresa;
        this.task = task;
        this.img = img;
        this.fechaStart = fechaStart;
        this.fechaEnd = fechaEnd;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "id=" + id + ", empresa=" + empresa + ", task=" + task + ", img=" + img + ", fechaStart=" + fechaStart + ", fechaEnd=" + fechaEnd + '}';
    }

    

    
    
}
