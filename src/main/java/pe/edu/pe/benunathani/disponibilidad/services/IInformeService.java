package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Informe;


import java.util.List;

public interface IInformeService {

    public void insert (Informe informe);
    List<Informe> list();
    public void delete(int id);
    public Informe listId(int idInforme);
}
