package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table( name= "tests")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTest;
    @Column(name= "fechaTest", nullable = false)
    private LocalDate fechaTest;

    @ManyToOne
    @JoinColumn(name ="idPaciente")
    private Paciente paciente;

    public Test() {
    }

    public Test(int idTest, LocalDate fechaTest, Paciente paciente) {
        this.idTest = idTest;
        this.fechaTest = fechaTest;
        this.paciente = paciente;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public LocalDate getFechaTest() {
        return fechaTest;
    }

    public void setFechaTest(LocalDate fechaTest) {
        this.fechaTest = fechaTest;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
