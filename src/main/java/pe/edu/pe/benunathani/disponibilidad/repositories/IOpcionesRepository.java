package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.pe.benunathani.disponibilidad.entities.Opciones;

import java.util.List;

public interface IOpcionesRepository extends JpaRepository<Opciones, Integer> {
    @Query("from Opciones o where o.descripcionOpciones like %:descripcionOpciones%")
    List<Opciones> findBydescripcionOpciones (String descripcionOpciones);
}
