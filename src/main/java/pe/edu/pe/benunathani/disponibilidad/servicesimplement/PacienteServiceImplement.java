package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.dtos.PacienteUsuarioDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;
import pe.edu.pe.benunathani.disponibilidad.repositories.IPacienteRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IPacienteService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteServiceImplement implements IPacienteService {
    private static Date parseDate(String dateString) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Formato de fecha deseado
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace(); // Manejo de errores en caso de que la cadena no sea válida
            return null;
        }
    }
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
    public void delete(int idPaciente) {
        pR.deleteById(idPaciente);
    }

    @Override
    public Paciente listId(int idPaciente) {
        return pR.findById(idPaciente).orElse(new Paciente());
    }

    @Override
    public List<PacienteUsuarioDTO> reportefechasPaciente() {
        List<String[]> nombresynacimientos = pR.getnombresynacimientos();
        List<PacienteUsuarioDTO> pacienteUsuarioDTOS = new ArrayList<>();

        for (String[] data : nombresynacimientos) {
            PacienteUsuarioDTO dto = new PacienteUsuarioDTO();
            dto.setUsuarioname(data[0]);
            dto.setNacimiento(parseDate(data[1]));
            pacienteUsuarioDTOS.add(dto);
        }

        return pacienteUsuarioDTOS;
    }
}
