package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class PacienteDTO {
    private int idpaciente;
    private String correopaciente;
    private LocalDate nacimientopaciente;
    private Usuario usuario;

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getCorreopaciente() {
        return correopaciente;
    }

    public void setCorreopaciente(String correopaciente) {
        this.correopaciente = correopaciente;
    }

    public LocalDate getNacimientopaciente() {
        return nacimientopaciente;
    }

    public void setNacimientopaciente(LocalDate nacimientopaciente) {
        this.nacimientopaciente = nacimientopaciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
