package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Opcion;
import pe.edu.pe.benunathani.disponibilidad.repositories.IOpcionRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IOpcionService;

import java.util.List;
@Service
public class OpcionServiceImplement implements IOpcionService {

    @Autowired
    private IOpcionRepository oR;
    @Override
    public void insert(Opcion opcion) {
        oR.save(opcion);
    }

    @Override
    public List<Opcion> list() {
        return oR.findAll();
    }

    @Override
    public void delete(int idOpcion) {oR.deleteById(idOpcion);}

    @Override
    public Opcion listId(int idOpcion) {return oR.findById(idOpcion).orElse(new Opcion());}

    @Override
    public List<Opcion> buscarDescripcion(String descripcionOpcion) {
        return oR.findBydescripcionOpcion(descripcionOpcion);
    }
}