package pe.edu.pe.benunathani.disponibilidad.repositories;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.disponibilidad.entities.Rutinas_recreativas;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface IRutinas_recreativasRepository extends JpaRepository<Rutinas_recreativas, Integer> {
}
