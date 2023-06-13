package pe.edu.pe.benunathani.disponibilidad.services;
import pe.edu.pe.benunathani.disponibilidad.entities.Rutinas_recreativas;


import java.util.List;

public interface IRutinas_recreativasService  {
    void insert(Rutinas_recreativas rutinas_recreativas);

    List<Rutinas_recreativas > list();

    public void delete(int id);

    public Rutinas_recreativas  ListID(int id);
}
