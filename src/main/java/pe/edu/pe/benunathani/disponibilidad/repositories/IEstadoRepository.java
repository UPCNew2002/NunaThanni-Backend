package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.disponibilidad.entities.Estado;

@Repository
public interface IEstadoRepository extends JpaRepository<Estado,Integer> {
}
