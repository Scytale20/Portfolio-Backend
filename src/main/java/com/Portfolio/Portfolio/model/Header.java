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
public class Header {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String name;
    private String backImg;
    private String profImg;
    private String tittle;
    private String logo;
    private String tituloLogo;    

    public Header() {
    }

    public Header(Long id, String name, String backImg, String profImg, String tittle, String logo, String tituloLogo) {
        this.id = id;
        this.name = name;
        this.backImg = backImg;
        this.profImg = profImg;
        this.tittle = tittle;
        this.logo = logo;
        this.tituloLogo = tituloLogo;
    }

    @Override
    public String toString() {
        return "Header{" + "id=" + id + ", name=" + name + ", backImg=" + backImg + ", profImg=" + profImg + ", tittle=" + tittle + ", logo=" + logo + ", tituloLogo=" + tituloLogo + '}';
    }
    
    
   
    
    
    
    }

    
