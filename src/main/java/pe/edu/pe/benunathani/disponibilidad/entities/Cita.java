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

    public Cita() {
    }

    public Cita(int idCita, LocalDate fechaCita, Estado estado) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.estado = estado;
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
}
