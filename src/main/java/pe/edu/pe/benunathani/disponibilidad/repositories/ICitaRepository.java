package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.disponibilidad.entities.Cita;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ICitaRepository extends JpaRepository<Cita,Integer> {

    @Query("from Cita c where c.fechaCita=:fecha")
    List<Cita> buscarCita(@Param("fecha") LocalDate fecha);
}