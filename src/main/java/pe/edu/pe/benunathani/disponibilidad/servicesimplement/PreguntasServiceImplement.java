package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Preguntas;
import pe.edu.pe.benunathani.disponibilidad.repositories.IPreguntasRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IPreguntasService;

import java.util.List;

@Service
public class PreguntasServiceImplement implements IPreguntasService {
    @Autowired
    private IPreguntasRepository prR;
    @Override
    public void insert(Preguntas preguntas){
        prR.save(preguntas);
    }
    @Override
    public List<Preguntas> list() {
        return prR.findAll();
    }

    @Override
    public void delete(int idPreguntas) {
        prR.deleteById(idPreguntas);
    }

    @Override
    public Preguntas listId(int idPreguntas) {
        return prR.findById(idPreguntas).orElse(new Preguntas());
    }
}
