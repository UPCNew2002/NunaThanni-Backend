package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pe.benunathani.disponibilidad.entities.Informe;

public interface IInformeRepository extends JpaRepository<Informe, Integer> {
}
