package com.example.proyecto.modulos.sala.controlador;

import com.example.proyecto.modulos.sala.dto.SalaDTO;
import com.example.proyecto.modulos.sala.servicio.SalaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Sala")
public class SalaControlador {

    @Autowired
    private SalaServicio salaServicio;

    /*Servicio de obtener Lista salas*/
    @GetMapping("obtener")
    public ResponseEntity<List<SalaDTO>> obtenerSala(){
        List<SalaDTO> respuesta = salaServicio.obtenerSala();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de obtener una sala*/
    @GetMapping("obtener/id")
    public ResponseEntity<SalaDTO> obtenerSala(@RequestParam Long idSala){
        SalaDTO respuesta = salaServicio.obtenerSalaPorId(idSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de crear*/
    @PostMapping("guardar")
    public ResponseEntity<Boolean> guardarSala(@RequestBody SalaDTO parametros){
        Boolean respuesta = salaServicio.guardarSala(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de Modificar*/
    @PutMapping("actualizar")
    public ResponseEntity<Boolean> actualizarSala(@RequestBody SalaDTO parametros){
        Boolean respuesta = salaServicio.actualizarSala(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de eliminar Sala (eliminado lógico)*/
    @DeleteMapping("eliminar")
    public ResponseEntity<Boolean> eliminarSala(@RequestParam Long idSala){
        Boolean respuesta = salaServicio.eliminarSala(idSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*(eliminado lógico)*/
    @PutMapping("activar-inactivar")
    public ResponseEntity<Boolean> activarInactivar(@RequestParam Long idSala){
        Boolean respuesta = salaServicio.activarInactivar(idSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

}