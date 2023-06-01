package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Preguntas;

import java.util.List;
public interface IPreguntasService {
    public void insert (Preguntas preguntas);
    List<Preguntas> list();
    public void delete(int idPreguntas);
    public Preguntas listId(int idPreguntas);
}
