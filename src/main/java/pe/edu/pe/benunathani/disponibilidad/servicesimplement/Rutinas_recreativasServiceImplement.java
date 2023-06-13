package pe.edu.pe.benunathani.disponibilidad.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Rutinas_recreativas;
import pe.edu.pe.benunathani.disponibilidad.repositories.IRutinas_recreativasRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IRutinas_recreativasService;

import java.util.List;

@Service
public class Rutinas_recreativasServiceImplement implements IRutinas_recreativasService {

    @Autowired
    private IRutinas_recreativasRepository rR;
    @Override
    public void insert(Rutinas_recreativas rutinas_recreativas) {
        rR.save(rutinas_recreativas);
    }

    @Override
    public List<Rutinas_recreativas> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Rutinas_recreativas ListID(int id) {
        return rR.findById(id).orElse(new Rutinas_recreativas());
    }
}
