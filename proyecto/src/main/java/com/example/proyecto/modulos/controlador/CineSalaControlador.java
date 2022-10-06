package com.example.proyecto.modulos.cinesala.controlador;

import com.example.proyecto.modulos.cinesala.dto.CineSalaDTO;
import com.example.proyecto.modulos.cinesala.servicio.CineSalaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CineSala")
public class CineSalaControlador {

    @Autowired
    private CineSalaServicio cineSalaServicio;

    /*Servicio de obtener Lista salas*/
    @GetMapping("obtener")
    public ResponseEntity<List<CineSalaDTO>> obtenerCineSala(){
        List<CineSalaDTO> respuesta = cineSalaServicio.obtenerCineSala();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de obtener una cineSala*/
    @GetMapping("obtener/id")
    public ResponseEntity<CineSalaDTO> obtenerCineSala(@RequestParam Long idCineSala){
        CineSalaDTO respuesta = cineSalaServicio.obtenerCineSalaPorId(idCineSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de crear*/
    @PostMapping("guardar")
    public ResponseEntity<Boolean> guardarCineSala(@RequestBody CineSalaDTO parametros){
        Boolean respuesta = cineSalaServicio.guardarCineSala(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de Modificar*/
    @PutMapping("actualizar")
    public ResponseEntity<Boolean> actualizarCineSala(@RequestBody CineSalaDTO parametros){
        Boolean respuesta = cineSalaServicio.actualizarCineSala(parametros);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*Servicio de eliminar CineSala (eliminado lógico)*/
    @DeleteMapping("eliminar")
    public ResponseEntity<Boolean> eliminarCineSala(@RequestParam Long idCineSala){
        Boolean respuesta = cineSalaServicio.eliminarCineSala(idCineSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    /*(eliminado lógico)*/
    @PutMapping("activar-inactivar")
    public ResponseEntity<Boolean> activarInactivar(@RequestParam Long idCineSala){
        Boolean respuesta = cineSalaServicio.activarInactivar(idCineSala);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

}