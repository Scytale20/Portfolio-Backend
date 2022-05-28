
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
public class Proyecto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String proyectoName;
    private String descripcion;
    private String img;
    private String link;

    public Proyecto() {
    }

    public Proyecto(Long id, String proyectoName, String descripcion, String img, String link) {
        this.id = id;
        this.proyectoName = proyectoName;
        this.descripcion = descripcion;
        this.img = img;
        this.link = link;
    }

    
    
}
