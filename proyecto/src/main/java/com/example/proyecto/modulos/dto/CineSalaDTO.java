package com.example.proyecto.modulos.dto;

import com.example.proyecto.modelos.Cine;
import java.sql.Timestamp;
import javax.persistence.*;
import java.util.Set;
import com.example.proyecto.modelos.CineSala;


public class CineSalaDTO {

    private Integer cineSalaId;

    private Timestamp fechaAlta;

    private Timestamp fechaModificacion;

    private Boolean registroActivo;

    public CineSalaDTO(Integer cineSalaId, Timestamp fechaAlta, Timestamp fechaModificacion, Boolean registroActivo) {
        this.cineSalaId = cineSalaId;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.registroActivo = registroActivo;
    }

}