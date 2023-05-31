package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Opciones;
import pe.edu.pe.benunathani.disponibilidad.repositories.IOpcionesRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IOpcionesService;

import java.util.List;
@Service
public class OpcionesServiceImplement implements IOpcionesService {

    @Autowired
    private IOpcionesRepository oR;
    @Override
    public void insert(Opciones opciones) {
        oR.save(opciones);
    }

    @Override
    public List<Opciones> list() {
        return oR.findAll();
    }

    @Override
    public void delete(int idOpciones) {oR.deleteById(idOpciones);}

    @Override
    public Opciones listId(int idOpciones) {return oR.findById(idOpciones).orElse(new Opciones());}

    @Override
    public List<Opciones> buscarDescripcion(String descripcionOpciones) {
        return oR.findBydescripcionOpciones(descripcionOpciones);
    }
}
