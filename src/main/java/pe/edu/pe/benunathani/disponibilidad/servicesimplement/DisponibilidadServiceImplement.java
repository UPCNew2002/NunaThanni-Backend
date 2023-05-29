package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Disponibilidad;
import pe.edu.pe.benunathani.disponibilidad.repositories.IDisponibilidadRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IDisponibilidadService;

import java.util.List;

@Service
public class DisponibilidadServiceImplement implements IDisponibilidadService {
    @Autowired
    private IDisponibilidadRepository dR;

    @Override
    public void insert(Disponibilidad disponibilidad) {
        dR.save(disponibilidad);
    }

    @Override
    public List<Disponibilidad> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDisponibilidad) {
        dR.deleteById(idDisponibilidad);
    }

    @Override
    public Disponibilidad listId(int idDisponibilidad) {return dR.findById(idDisponibilidad).orElse(new Disponibilidad());}
}
