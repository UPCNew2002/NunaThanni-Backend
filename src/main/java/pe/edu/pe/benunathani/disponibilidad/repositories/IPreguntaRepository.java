package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;
import pe.edu.pe.benunathani.disponibilidad.entities.Pregunta;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IPreguntaRepository extends JpaRepository<Pregunta,Integer> {


}
