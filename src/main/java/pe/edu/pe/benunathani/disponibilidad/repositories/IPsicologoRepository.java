package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.pe.benunathani.disponibilidad.entities.Psicologo;

import java.util.List;

@Repository
public interface IPsicologoRepository extends JpaRepository<Psicologo,Integer> {
    @Query("from Psicologo v where v.correoPsicologo=:correo")
    List<Psicologo> buscarCorreo(@Param("correo") String correo);

    @Query(value = "SELECT e.tipo_Especialidad,count(p.id_Psicologo) from Psicologos p \n" +
            "join Especialidades e on  e.id_Especialidad = p.id_Psicologo \n" +
            "group by e.tipo_Especialidad ORDER BY COUNT(e.tipo_Especialidad) DESC",
            nativeQuery = true)
    List<String[]> getEspecialidadCountByPsicologo();
}
