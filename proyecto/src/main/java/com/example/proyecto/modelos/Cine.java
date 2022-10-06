package com.example.proyecto.modelos;

import java.sql.Timestamp;
import javax.persistence.*;
import java.util.Set;
import com.example.proyecto.modelos.CineSala;

@Entity
@Table(name = "m_cine")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cine")
    private Integer idCine;

    @OneToMany(mappedBy = "cine", fetch = FetchType.LAZY)
    private Set<CineSala> cineSala;

    @Column
    private String nombre;

    @Column
    private Timestamp fechaAlta;

    @Column
    private Timestamp fechaModificacion;

    @Column
    private boolean registroActivo;

    public Integer getIdCine() {
        return idCine;
    }

    public void setIdCine(Integer idCine) {
        this.idCine = idCine;
    }

    public Set<CineSala> getCineSala() {
        return cineSala;
    }

    public void setCineSala(Set<CineSala> cineSala) {
        this.cineSala = cineSala;
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






