package com.example.proyecto.modulos.dto;

import com.example.proyecto.modelos.Cine;
import java.sql.Timestamp;
import javax.persistence.*;
import java.util.Set;
import com.example.proyecto.modelos.CineSala;

public class SalaDTO {

    private Integer idSala;
    private Byte numeroSala;
    private Integer totalAsientos;
    private Timestamp fechaAlta;
    private Timestamp fechaModificacion;
    private boolean registroActivo;

    public SalaDTO(Integer idSala, Byte numeroSala, Integer totalAsientos, Timestamp fechaAlta, Timestamp fechaModificacion, boolean registroActivo) {
        this.idSala = idSala;
        this.numeroSala = numeroSala;
        this.totalAsientos = totalAsientos;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.registroActivo = registroActivo;
    }

    public SalaDTO(Integer idSala) {
        this.idSala = idSala;
    }

    public SalaDTO(Byte numeroSala) {
        this.numeroSala = numeroSala;
    }

    public SalaDTO(Timestamp fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public SalaDTO(boolean registroActivo) {
        this.registroActivo = registroActivo;
    }

    public SalaDTO(Integer idSala, Byte numeroSala, Integer totalAsientos) {
        this.idSala = idSala;
        this.numeroSala = numeroSala;
        this.totalAsientos = totalAsientos;
    }

    public SalaDTO(Integer idSala, Byte numeroSala, Integer totalAsientos, Timestamp fechaAlta, Timestamp fechaModificacion) {
        this.idSala = idSala;
        this.numeroSala = numeroSala;
        this.totalAsientos = totalAsientos;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public Byte getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Byte numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Integer getTotalAsientos() {
        return totalAsientos;
    }

    public void setTotalAsientos(Integer totalAsientos) {
        this.totalAsientos = totalAsientos;
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