package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;

import java.util.List;

public interface ITratamientoService  {
    public void insert(Tratamiento tratamiento);
    List<Tratamiento> list();

}
