package com.example.proyecto.repositorios;

import com.example.proyecto.modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRespositorio extends JpaRepository<Sala,Integer> {
    @Query("select s from Sala as s " +
            "where s.registroActivo = true")
    List<Sala> datos();


    List<Sala> findAll();
}