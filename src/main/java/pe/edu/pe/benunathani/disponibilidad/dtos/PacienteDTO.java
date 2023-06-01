package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Usuario;

import java.time.LocalDate;

public class PacienteDTO {
    private int idPaciente;
    private String correoPaciente;
    private LocalDate nacimientoPaciente;
    private Usuario usuario;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getCorreoPaciente() {
        return correoPaciente;
    }

    public void setCorreoPaciente(String correoPaciente) {
        this.correoPaciente = correoPaciente;
    }

    public LocalDate getNacimientoPaciente() {
        return nacimientoPaciente;
    }

    public void setNacimientoPaciente(LocalDate nacimientoPaciente) {
        this.nacimientoPaciente = nacimientoPaciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
