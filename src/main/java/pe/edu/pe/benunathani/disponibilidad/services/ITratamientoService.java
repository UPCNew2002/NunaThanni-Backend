package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;

import java.util.List;

public interface ITratamientoService  {
    public void insert(Tratamiento tratamiento);
    List<Tratamiento> list();
    public void delete(int idTratamiento);
    public Tratamiento listId(int idTratamiento);
    List<Tratamiento> buscarTema(String temaTratamiento);
}
