package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;

import java.time.LocalDate;

public class TestDTO {
    private int idTest;
    private LocalDate fechaTest;
    private Paciente paciente;

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
