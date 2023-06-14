package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Pregunta;


import java.util.List;

public interface IPreguntaService {
    public void insert (Pregunta pregunta);
    List<Pregunta> list();

    public void delete(int idPregunta);
    public Pregunta listId (int idPregunta);
}
