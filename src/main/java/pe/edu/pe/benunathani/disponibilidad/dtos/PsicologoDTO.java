package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Disponibilidad;
import pe.edu.pe.benunathani.disponibilidad.entities.Especialidad;
import pe.edu.pe.benunathani.disponibilidad.entities.Usuario;

public class PsicologoDTO {

    private int idPsicologo;
    private String correoPsicologo;
    private String fotoPsicologo;
    private Usuario usuario;
    private Especialidad especialidad;
    private Disponibilidad disponibilidad;

    public int getIdPsicologo() {
        return idPsicologo;
    }

    public void setIdPsicologo(int idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public String getCorreoPsicologo() {
        return correoPsicologo;
    }

    public void setCorreoPsicologo(String correoPsicologo) {
        this.correoPsicologo = correoPsicologo;
    }

    public String getFotoPsicologo() {
        return fotoPsicologo;
    }

    public void setFotoPsicologo(String fotoPsicologo) {
        this.fotoPsicologo = fotoPsicologo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
