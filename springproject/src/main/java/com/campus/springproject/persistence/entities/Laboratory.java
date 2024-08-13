package com.campus.springproject.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "labortory")
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namelab;

    @ManyToOne
    @JoinColumn(name = "codecity")
    private String codecityreg;

    public Laboratory(Long id, String namelab) {
        this.id = id;
        this.namelab = namelab;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamelab() {
        return namelab;
    }

    public void setNamelab(String namelab) {
        this.namelab = namelab;
    }

    public String getCodecityreg() {
        return codecityreg;
    }

    public void setCodecityreg(String codecityreg) {
        this.codecityreg = codecityreg;
    }

    
    

}
