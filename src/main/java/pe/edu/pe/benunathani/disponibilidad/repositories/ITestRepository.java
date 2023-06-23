package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.pe.benunathani.disponibilidad.entities.Test;

import java.util.List;

public interface ITestRepository extends JpaRepository<Test,Integer> {
    @Query(value = "SELECT t.idtest, COUNT(p.id_pregunta) FROM tests t\n" +
            "JOIN preguntas p ON t.idtest = p.idtest\n" +
            "GROUP BY t.idtest\n" +
            "ORDER BY COUNT(p.id_pregunta) DESC;",
            nativeQuery = true)
    List<String[]> getPreguntasCountByTest();


}
