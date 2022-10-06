package com.example.proyecto.modelos;

import java.sql.Timestamp;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "r_cine_sala")
public class CineSala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cine_sala")
    private Integer idCineSala;

    @JoinColumn(name = "id_cine")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cine cine;

    @JoinColumn(name = "id_sala")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sala sala;

    @Column
    private Timestamp fechaAlta;

    @Column
    private Timestamp fechaModificacion;

    @Column
    private boolean registroActivo;

    public Integer getIdCineSala() {
        return idCineSala;
    }

    public void setIdCineSala(Integer idCineSala) {
        this.idCineSala = idCineSala;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
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