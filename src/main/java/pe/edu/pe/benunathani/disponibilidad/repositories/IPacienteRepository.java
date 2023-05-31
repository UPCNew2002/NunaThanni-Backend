package pe.edu.pe.benunathani.disponibilidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;

import java.time.LocalDate;
import java.util.List;

public interface IPacienteRepository extends JpaRepository<Paciente,Integer> {
    @Query("from Paciente p where p.nacimientoPaciente=:fecha")
    List<Paciente> buscarPacientes(@Param("fecha")LocalDate fecha);
}
