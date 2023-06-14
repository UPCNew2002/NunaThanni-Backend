package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.disponibilidad.entities.Pregunta;

@Repository
public interface IPreguntaRepository extends JpaRepository<Pregunta,Integer> {
}
