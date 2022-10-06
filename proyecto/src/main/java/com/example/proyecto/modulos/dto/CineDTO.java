package com.example.proyecto.modulos.dto;

import com.example.proyecto.modelos.Cine;
import java.sql.Timestamp;
import javax.persistence.*;
import java.util.Set;
import com.example.proyecto.modelos.CineSala;

public class CineDTO {
    private Integer idCine;
    private String nombre;
    private Timestamp fechaAlta;
    private Timestamp fechaModificacion;
    private Boolean registroActivo;


    public CineDTO(Integer idCine, String nombre, Timestamp fechaAlta, Timestamp fechaModificacion, Boolean registroActivo) {
        this.idCine = idCine;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.registroActivo = registroActivo;
    }

    public CineDTO(Cine cine){
        if (cine != null){
            this.idCine = cine.getIdCine();
            this.nombre = cine.getNombre();
            this.fechaAlta = cine.getFechaAlta();
            this.fechaModificacion = cine.getFechaModificacion();
        }
    }



    public CineDTO(Integer idCine) {
        this.idCine = idCine;
    }

    public CineDTO(String nombre) {
        this.nombre = nombre;
    }

    public CineDTO(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public CineDTO(boolean registroActivo) {
        this.registroActivo = registroActivo;
    }

    public CineDTO(Integer idCine, String nombre, Timestamp fechaAlta) {
        this.idCine = idCine;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdCine() {
        return idCine;
    }

    public void setIdCine(Integer idCine) {
        this.idCine = idCine;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Timestamp getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Timestamp fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public boolean isRegistroActivo() {
        return registroActivo;
    }

    public void setRegistroActivo(boolean registroActivo) {
        this.registroActivo = registroActivo;
    }

}