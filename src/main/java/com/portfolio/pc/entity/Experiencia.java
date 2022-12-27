
package com.portfolio.pc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;


@Entity

public class Experiencia implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String cargo;
   
   @Lob
   private String descripcion;
   private String empresa;
   private Boolean esTrabajoActual;
   
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date inicio;
   
   @Temporal(javax.persistence.TemporalType.DATE)
   private Date fin;
   private String imgE;
  
    public Experiencia() {
    }

    public Experiencia(String cargo, String descripcion, String empresa, Boolean esTrabajoActual, Date inicio, Date fin, String imgE) {
       
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.empresa = empresa;
        this.esTrabajoActual = esTrabajoActual;
        this.inicio = inicio;
        this.fin = fin;
        this.imgE = imgE;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Boolean getEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(Boolean esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }
   
   
}
