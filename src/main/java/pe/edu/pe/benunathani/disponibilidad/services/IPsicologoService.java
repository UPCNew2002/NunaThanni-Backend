package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.dtos.PsicologoEspecialidadDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Psicologo;

import java.time.LocalDate;
import java.util.List;

public interface IPsicologoService {

    public void insert(Psicologo psicologo);
    List<Psicologo> list();
    public void delete(int idPsicologo);
    public Psicologo  listId(int idPsicologo);
    List<Psicologo> find(String correo);

    public List<PsicologoEspecialidadDTO> reporte_especialidad();

}
