package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;
    @Column(name = "correoPaciente", length = 40, nullable = false)
    private String correoPaciente;
    @Column(name = "nacimientoPaciente", nullable = false)
    private LocalDate nacimientoPaciente;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Paciente() {
    }

    public Paciente(int idPaciente, String correoPaciente, LocalDate nacimientoPaciente, Usuario usuario) {
        this.idPaciente = idPaciente;
        this.correoPaciente = correoPaciente;
        this.nacimientoPaciente = nacimientoPaciente;
        this.usuario = usuario;
    }

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
