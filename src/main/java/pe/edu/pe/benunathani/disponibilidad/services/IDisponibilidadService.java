package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Disponibilidad;

import java.util.List;

public interface IDisponibilidadService {
    public void insert(Disponibilidad disponibilidad);
    List<Disponibilidad> list();
    public void delete(int idDisponibilidad);
    public Disponibilidad listId(int idDisponibilidad);
}
