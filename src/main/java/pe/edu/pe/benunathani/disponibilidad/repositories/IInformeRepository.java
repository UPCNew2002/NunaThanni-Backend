package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.disponibilidad.entities.Informe;

import java.util.List;

@Repository
public interface IInformeRepository extends JpaRepository<Informe, Integer> {
    @Query("from Informe i where i.resultado_testInforme=:resultado")
    List<Informe> buscarResultado(@Param("resultado") String resultado);

    @Query(value = "SELECT i.resultado_test_Informe,count(t.id_Tratamiento) from Informes i \n" +
            "join Tratamiento t on  i.id_Tratamiento = t.id_Tratamiento \n" +
            "group by i.resultado_test_Informe ORDER BY COUNT(i.resultado_test_Informe) DESC",
            nativeQuery = true)
    List<String[]> getTratamientoCountByInforme();
}
