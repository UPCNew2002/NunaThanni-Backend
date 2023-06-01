package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Opciones;

import java.util.List;

public interface IOpcionesService {
    public void insert(Opciones opciones);
    List<Opciones> list();
    public void delete(int idOpciones);
    public Opciones listId(int idOpciones);
    List<Opciones> buscarDescripcion(String descripcionOpciones);
}
