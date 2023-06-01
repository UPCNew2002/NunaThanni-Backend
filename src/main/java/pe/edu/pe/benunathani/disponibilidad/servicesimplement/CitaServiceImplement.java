package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Cita;
import pe.edu.pe.benunathani.disponibilidad.repositories.ICitaRepository;
import pe.edu.pe.benunathani.disponibilidad.services.ICitaService;


import java.time.LocalDate;
import java.util.List;

@Service
public class CitaServiceImplement implements ICitaService {
    @Autowired
    private ICitaRepository cR;


    @Override
    public void insert(Cita cita) {
        cR.save(cita);
    }

    @Override
    public List<Cita> list() {
        return cR.findAll();
    }

    @Override
    public List<Cita> find(LocalDate fecha) {
        return cR.buscarCita(fecha);
    }

    @Override
    public void delete(int idCita) {
        cR.deleteById(idCita);
    }

    @Override
    public Cita listId(int idCita) {
        return cR.findById(idCita).orElse(new Cita());
    }

    @Override
    public int ContarFecha() {
        return cR.ContarFecha();
    }
}