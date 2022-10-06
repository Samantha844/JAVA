package com.example.proyecto.modulos.servicio;

import com.example.proyecto.modelos.Cine;

import com.example.proyecto.modulos.dto.CineDTO;
import com.example.proyecto.repositorios.CineRespositorio;
import com.example.proyecto.repositorios.CineSalaRespositorio;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class CineServicio {

    @Autowired
    private CineRespositorio cineRespositorio;

    @Autowired
    private CineSalaRespositorio cineSalaRespositorio;

    public List<CineDTO> obtenerCine(){
        List<Cine> lista = cineRespositorio.datos();
        return lista.stream().map(CineDTO::new).collect(Collectors.toList());
    }

    public CineDTO obtenerCinePorId(Integer idCine){
        Optional<Cine> cine = cineRespositorio.findById(idCine);

        if (cine.isPresent()){
            return new CineDTO(cine.get().getIdCine(), cine.get().getNombre(), cine.get().getFechaAlta(), cine.get().getFechaModificacion(), cine.get().getRegistroActivo());
        }

        return null;
    }

    public Boolean guardarCine(CineDTO parametros) {

        Cine cine = new Cine();

        if (parametros.getIdCine() != null){
            cine = cineRespositorio.getOne(parametros.getIdCine());
        }

        cine.setNombre(parametros.getNombre());
        cine.setFechaAlta(parametros.getFechaAlta());
        cine.setFechaModificacion(parametros.getFechaModificacion());
        cine.setRegistroActivo(Boolean.TRUE);

        cineRespositorio.save(cine);


        return true;
    }

    public Boolean actualizarCine(CineDTO parametros) {

        Cine cine = cineRespositorio.getOne(parametros.getIdCine());
        cine.setNombre(parametros.getNombre());
        cine.setFechaModificacion(parametros.getFechaModificacion());
        cine.setRegistroActivo(Boolean.TRUE);

        cineRespositorio.save(cine);


        return true;
    }

    public Boolean activarInactivar(CineDTO idCine) {
        Cine cine = cineRespositorio.getOne(idCine.getIdCine());
        cine.setRegistroActivo(!cine.getRegistroActivo());
        cineRespositorio.save(cine);
        return true;
    }
}
