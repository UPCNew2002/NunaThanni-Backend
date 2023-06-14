package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;

import javax.persistence.Column;
import java.time.LocalDate;

public class TestDTO {
    private int idtest;
    private LocalDate fechatest;
    private Paciente paciente;

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
