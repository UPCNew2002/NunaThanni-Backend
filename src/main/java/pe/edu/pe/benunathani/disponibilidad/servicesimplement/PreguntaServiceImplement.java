package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Pregunta;
import pe.edu.pe.benunathani.disponibilidad.repositories.IPreguntaRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IPreguntaService;

import java.util.List;

@Service
public class PreguntaServiceImplement implements IPreguntaService {

    @Autowired
    private IPreguntaRepository pR;
    @Override
    public void insert(Pregunta pregunta) {
        pR.save(pregunta);
    }

    @Override
    public List<Pregunta> list() {
        return pR.findAll();
    }
}
