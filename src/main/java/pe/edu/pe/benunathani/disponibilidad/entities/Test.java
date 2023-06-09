package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table( name= "tests")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtest;
    @Column(name= "fechatest", nullable = false)
    private LocalDate fechatest;

    @ManyToOne
    @JoinColumn(name ="idpaciente")
    private Paciente paciente;

    public Test() {
    }

    public Test(int idtest, LocalDate fechatest, Paciente paciente) {
        this.idtest = idtest;
        this.fechatest = fechatest;
        this.paciente = paciente;
    }

    public int getIdtest() {
        return idtest;
    }

    public void setIdtest(int idtest) {
        this.idtest = idtest;
    }

    public LocalDate getFechatest() {
        return fechatest;
    }

    public void setFechatest(LocalDate fechatest) {
        this.fechatest = fechatest;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
