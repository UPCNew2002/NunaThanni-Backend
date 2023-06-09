package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.dtos.RutinaTratamientoDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;

import java.util.List;

public interface ITratamientoService {

    public void insert(Tratamiento tratamiento);
    List<Tratamiento> list();
    public void delete(int idTratamiento);
    public Tratamiento listId(int idTratamiento);
    List<Tratamiento> find(String temaTratamiento);

    public List<RutinaTratamientoDTO> reporte_tratamiento();
}
