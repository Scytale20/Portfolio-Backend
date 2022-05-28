
package com.Portfolio.Portfolio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;   
    private String institucion;
    private String estudios;
    private String img;    
    private String fechaStart;
    private String fechaEnd;

    public Educacion() {
    }

    public Educacion(Long id, String institucion, String estudios, String img, String fechaStart, String fechaEnd) {
        this.id = id;
        this.institucion = institucion;
        this.estudios = estudios;
        this.img = img;
        this.fechaStart = fechaStart;
        this.fechaEnd = fechaEnd;
    }

    
    
    
        
}
