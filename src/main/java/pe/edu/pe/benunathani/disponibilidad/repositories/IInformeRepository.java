package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.pe.benunathani.disponibilidad.entities.Informe;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;

import java.util.List;

public interface IInformeRepository extends JpaRepository<Informe, Integer> {

    @Query("from Informe i where i.resultado_testInforme like %:resultado_testInforme%")
    List<Informe> findByresultado_testInforme(String resultado_testInforme);
}
