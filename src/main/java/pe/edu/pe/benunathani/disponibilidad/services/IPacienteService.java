package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;

import java.time.LocalDate;
import java.util.List;

public interface IPacienteService {
    public void insert(Paciente paciente);
    List<Paciente> list();
    List<Paciente> find(LocalDate fecha);
    public void delete (int idPaciente);
    public Paciente listId (int idPaciente);
}
