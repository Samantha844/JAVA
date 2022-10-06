package com.example.proyecto.modelos;

import java.sql.Timestamp;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "c_sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sala")
    private Integer idSala;

    @OneToMany(mappedBy = "sala", fetch = FetchType.LAZY)
    private Set<CineSala> cineSala;

    @Column
    private Byte numeroSala;

    @Column
    private Integer totalAsientos;

    @Column
    private Timestamp fechaAlta;

    @Column
    private Timestamp fechaModificacion;

    @Column
    private boolean registroActivo;

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public Set<CineSala> getCineSala() {
        return cineSala;
    }

    public void setCineSala(Set<CineSala> cineSala) {
        this.cineSala = cineSala;
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




