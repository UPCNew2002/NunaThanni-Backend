package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.pe.benunathani.disponibilidad.entities.Test;

public interface ITestRepository extends JpaRepository<Test,Integer> {
}
