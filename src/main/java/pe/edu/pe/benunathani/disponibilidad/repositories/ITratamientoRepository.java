package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;

import java.util.List;

public interface ITratamientoRepository extends JpaRepository<Tratamiento, Integer> {
    @Query("from Tratamiento t where t.temaTratamiento like %:temaTratamiento%")
    List<Tratamiento> findBytemaTratamiento(String temaTratamiento);

    @Query(value = "SELECT t.tema_tratamiento,count(r.id) from Tratamiento t \n" +
            "join Rutinas_recreativas r on  t.id = r.id \n" +
            "group by t.tema_tratamiento ORDER BY COUNT(t.tema_tratamiento) DESC",
            nativeQuery = true)
    List<String[]> getRutinaCountByTratamiento();
}
