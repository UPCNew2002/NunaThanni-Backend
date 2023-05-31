package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name ="citas")
public class Cita {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idCita;
    @Column(name ="fechaCita", length = 30,nullable=false)
    private LocalDate fechaCita;

    @ManyToOne
    @JoinColumn(name ="idEstado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name ="idPaciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name ="idPsicologo")
    private Psicologo psicologo;

    public Cita() {
    }

    public Cita(int idCita, LocalDate fechaCita, Estado estado, Paciente paciente, Psicologo psicologo) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.estado = estado;
        this.paciente = paciente;
        this.psicologo = psicologo;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }
}
