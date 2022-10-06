package com.example.proyecto.repositorios;

package com.example.proyecto.modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CineRespositorio extends JpaRepository<Cine
    @Query("select c from Cine as c " + "where c.registroActivo = true")
    List<Cine> datos();

        List<Cine> findAll();
}