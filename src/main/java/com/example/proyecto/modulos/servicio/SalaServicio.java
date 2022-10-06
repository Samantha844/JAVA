package com.example.proyecto.modulos.servicio;

import com.example.proyecto.modelos.Sala;

import com.example.proyecto.modulos.dto.SalaDTO;
import com.example.proyecto.repositorios.SalaRespositorio;
import com.example.proyecto.repositorios.CineSalaRespositorio;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class SalaServicio {

    @Service
    public class SalaServicio {

        @Autowired
        private SalaRespositorio salaRepositorio;


        @Autowired
        private CineSalaRespositorio cineSalaRespositorio;

        public List<SalaDTO> obtenerSala(){
            List<Sala> lista = salaRepositorio.datos();
            return lista.stream().map(SalaDTO::new).collect(Collectors.toList());
        }

        public SalaDTO obtenerSalaPorId(Integer idSala){
            Optional<Sala> sala = salaRepositorio.findById(idSala);

            if (sala.isPresent()){
                return new SalaDTO(sala.get().getIdSala(), sala.get().getNumeroSala(), sala.get().getTotalAsientos(), sala.get().getFechaAlta(), sala.get().getFechaModificacion(), sala.get().getRegistroActivo());
            }

            return null;
        }

        public Boolean guardarSala(SalaDTO parametros) {

            Sala sala = new Sala();

            if (parametros.getIdSala() != null){
                sala = salaRepositorio.getOne(parametros.getIdSala()d());
            }


            sala.setNumeroSala(parametros.getNumeroSala());
            sala.setTotalAsientos(parametros.getTotalAsientos());
            sala.setFechaAlta(parametros.getFechaAlta());
            sala.setFechaModificacion(parametros.getFechaModificacion());
            sala.setRegistroActivo(Boolean.TRUE);

            salaRepositorio.save(sala);


            return true;
        }

        public Boolean actualizarSala(SalaDTO parametros) {

            Sala sala = salaRepositorio.getOne(parametros.getIdSala());
            sala.setNumeroSala(parametros.getNumeroSala());
            sala.setFechaModificacion(parametros.getFechaModificacion());
            sala.setRegistroActivo(Boolean.TRUE);

            salaRepositorio.save(sala);


            return true;
        }

        public Boolean activarInactivar(SalaDTO idSala) {
            Sala sala = salaRepositorio.getOne(idSala.getIdSala());
            sala.setRegistroActivo(!sala.getRegistroActivo());
            salaRepositorio.save(sala);
            return true;
        }
}
