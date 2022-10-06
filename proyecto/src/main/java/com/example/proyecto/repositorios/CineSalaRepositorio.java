package com.example.proyecto.repositorios;

package com.example.proyecto.modelos.Cine;

import com.example.proyecto.modulos.dto.CineSalaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyecto.modelos.Cine;
import com.example.proyecto.modelos.Sala;
import com.example.proyecto.modulos.CineSala.dto.CineSalaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface CineSalaRespositorio extends JpaRepository<CineSala,Integer> {
    @Query("select cs from CineSala as cs " +
            "where cs.registroActivo = true")
    List<CineSala datos();
}