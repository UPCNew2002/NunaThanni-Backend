package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Especialidad;

import java.util.List;

public interface IEspecialidadService {

    public void insert(Especialidad especialidad);
    List<Especialidad> list();
    public void delete(int idEspecialidad);
    public Especialidad listId(int idEspecialidad);

}
