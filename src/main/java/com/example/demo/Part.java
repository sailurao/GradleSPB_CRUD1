package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Part {
    private Integer id;
    private String name;
    private float pnumber;
  //  private Integer manufacturer;
   // private String mnumber;
   // private String description;

    public Part() {
    }

    public Part(   Integer id,  String name,   float pnumber) {
    //public Part(   Integer id,  String name,   String pnumber,  Integer manufacturer,  String mnumber,   String description) {
            this.id = id;
        this.name = name;
        this.pnumber = pnumber;
     //   this.manufacturer = manufacturer;
     //   this.mnumber = mnumber;
      //  this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPnumber() {
        return pnumber;
    }

    public void setPnumber(float pnumber) {
        this.pnumber = pnumber;
    }
/*
    public Integer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Integer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMnumber() {
        return mnumber;
    }

    public void setMnumber(String mnumber) {
        this.mnumber = mnumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }*/



    @Override
    public int hashCode() {
        final int prime = 20; //31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Part other = (Part) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
