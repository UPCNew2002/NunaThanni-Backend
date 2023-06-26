package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.dtos.InformeTratamientoDTO;
import pe.edu.pe.benunathani.disponibilidad.dtos.RutinaTratamientoDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Informe;
import pe.edu.pe.benunathani.disponibilidad.entities.Psicologo;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;


import java.util.List;

public interface IInformeService {

    public void insert (Informe informe);
    List<Informe> list();
    public void delete(int idInforme);
    public Informe listId(int idInforme);
    List<Informe> find(String resultado);

    public List<InformeTratamientoDTO> reporte_informe();
}
