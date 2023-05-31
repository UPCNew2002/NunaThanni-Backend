package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;
import pe.edu.pe.benunathani.disponibilidad.repositories.ITratamientoRepository;
import pe.edu.pe.benunathani.disponibilidad.services.ITratamientoService;

import java.util.List;
@Service
public class TratamientoServiceImplement implements ITratamientoService {

    @Autowired
    private ITratamientoRepository tR;
    @Override
    public void insert(Tratamiento tratamiento) {
        tR.save(tratamiento);
    }

    @Override
    public List<Tratamiento> list() {
        return tR.findAll();
    }
}
