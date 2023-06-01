package pe.edu.pe.benunathani.disponibilidad.services;
import pe.edu.pe.benunathani.disponibilidad.entities.Cita;

import java.time.LocalDate;
import java.util.List;

public interface ICitaService {
    public void insert (Cita cita);
    List<Cita> list();

    List<Cita> find (LocalDate fecha);

    public void delete (int idCita);

    public Cita listId (int idCita);

    public  int ContarFecha();
}