package pe.edu.pe.benunathani.disponibilidad.services;


import pe.edu.pe.benunathani.disponibilidad.entities.Estado;

import java.util.List;

public interface IEstadoService {

    public void insert (Estado estado);
    List<Estado> list();

    public void delete(int idEstado);
    public Estado listId(int idEstado);
}
