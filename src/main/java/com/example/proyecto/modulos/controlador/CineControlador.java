package com.example.proyecto.modulos.controlador.cine;

import com.example.proyecto.modulos.cine.dto.CineDTO;
import com.example.proyecto.modulos.cine.servicio.CineServicio;
import com.example.proyecto.modulos.servicio.CineServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Cine")
public class CineControlador {

    @Autowired
    private CineServicio cineServicio;

    /*Servicio de obtener Lista cines*/
    @GetMapping("obtener")
    public ResponseEntity<List<CineDTO>> obtenerCine(){
        List<CineDTO> respuesta = cineServicio.obtenerCine();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio  para relacionar una sala con un cine*/
    @GetMapping("obtener/cine/por-sala")
    public ResponseEntity<List<CineDTO>> obtenerCinePorSala(@RequestParam Integer idSala){
        List<CineDTO> respuesta = cineServicio.obtenerCinePorSala(idSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de obtener un cine*/
    @GetMapping("obtener/id")
    public ResponseEntity<CineDTO> obtenerCine(@RequestParam Long idCine){
        CineDTO respuesta = cineServicio.obtenerCinePorId(idCine);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de crear*/
    @PostMapping("guardar")
    public ResponseEntity<Boolean> guardarCine(@RequestBody CineDTO parametros){
        Boolean respuesta = cineServicio.guardarCine(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de Modificar*/
    @PutMapping("actualizar")
    public ResponseEntity<Boolean> actualizarCine(@RequestBody CineDTO parametros){
        Boolean respuesta = cineServicio.actualizarCine(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de eliminar Cine (eliminado lógico)*/
    @DeleteMapping("eliminar")
    public ResponseEntity<Boolean> eliminarCine(@RequestParam Long idCine){
        Boolean respuesta = cineServicio.eliminarCine(idCine);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*(eliminado lógico)*/
    @PutMapping("activar-inactivar")
    public ResponseEntity<Boolean> activarInactivar(@RequestParam Long idCine){
        Boolean respuesta = cineServicio.activarInactivar(idCine);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

}