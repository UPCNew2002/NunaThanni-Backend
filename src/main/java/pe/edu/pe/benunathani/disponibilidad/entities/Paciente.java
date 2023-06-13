package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpaciente;
    @Column(name = "correopaciente", length = 40, nullable = false)
    private String correopaciente;
    @Column(name = "nacimientopaciente", nullable = false)
    private LocalDate nacimientopaciente;
    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    public Paciente() {
    }

    public Paciente(int idpaciente, String correopaciente, LocalDate nacimientopaciente, Usuario usuario) {
        this.idpaciente = idpaciente;
        this.correopaciente = correopaciente;
        this.nacimientopaciente = nacimientopaciente;
        this.usuario = usuario;
    }

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
