package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;
import pe.edu.pe.benunathani.disponibilidad.repositories.IPacienteRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IPacienteService;

import java.time.LocalDate;
import java.util.List;

@Service
public class PacienteServiceImplement implements IPacienteService {
    @Autowired
    private IPacienteRepository pR;

    @Override
    public void insert(Paciente paciente) {
        pR.save(paciente);
    }

    @Override
    public List<Paciente> list() {
        return pR.findAll();
    }

    @Override
    public List<Paciente> find(LocalDate fecha) {
        return pR.buscarPacientes(fecha);
    }

    @Override
    public List<Paciente> finde(String correo) {
        return pR.findBycorreoPaciente(correo);
    }

    @Override
    public void delete(int idPaciente) {
        pR.deleteById(idPaciente);
    }

    @Override
    public Paciente listId(int idPaciente) {
        return pR.findById(idPaciente).orElse(new Paciente());
    }
}
