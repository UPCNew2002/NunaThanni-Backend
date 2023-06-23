package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Opcion;

import java.util.List;

public interface IOpcionService {
    public void insert(Opcion opcion);
    List<Opcion> list();
    public void delete(int idOpcion);
    public Opcion listId(int idOpcion);
    List<Opcion> buscarDescripcion(String descripcionOpcion);
}
