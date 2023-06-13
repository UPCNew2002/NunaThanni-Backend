package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;

import javax.persistence.Column;
import java.time.LocalDate;

public class TestDTO {
    private int idtest;
    private LocalDate fechatest;
    private Paciente paciente;
    private String pregunta;
    private String opciones;

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

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }
}
