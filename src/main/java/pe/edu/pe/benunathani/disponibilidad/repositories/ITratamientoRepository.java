package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;

import java.util.List;

public interface ITratamientoRepository extends JpaRepository<Tratamiento,Integer> {
    @Query("from Tratamiento t where t.temaTratamiento like %:temaTratamiento%")
    List<Tratamiento> findBytemaTratamiento(String temaTratamiento);

}
