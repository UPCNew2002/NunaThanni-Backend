package pe.edu.pe.benunathani.disponibilidad.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Estado;
import pe.edu.pe.benunathani.disponibilidad.repositories.IEstadoRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IEstadoService;

import java.util.List;

@Service
public class EstadoServiceImplement implements IEstadoService {
    @Autowired
    private  IEstadoRepository eR;

    @Override
    public void insert(Estado estado) {eR.save(estado);}

    @Override
    public List<Estado> list() { return eR.findAll();}

    @Override
    public void delete(int idEstado) {
        eR.deleteById(idEstado);
    }

    @Override
    public Estado listId(int idEstado) {
        return eR.findById(idEstado).orElse(new Estado());
    }


}