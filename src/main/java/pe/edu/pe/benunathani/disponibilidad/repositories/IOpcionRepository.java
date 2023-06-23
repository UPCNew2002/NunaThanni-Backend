package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.pe.benunathani.disponibilidad.entities.Opcion;

import java.util.List;

public interface IOpcionRepository extends JpaRepository<Opcion, Integer> {
    @Query("from Opcion o where o.descripcionOpcion like %:descripcionOpcion%")
    List<Opcion> findBydescripcionOpcion (String descripcionOpcion);
}