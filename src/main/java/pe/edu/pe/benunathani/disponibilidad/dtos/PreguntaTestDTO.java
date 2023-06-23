package pe.edu.pe.benunathani.disponibilidad.dtos;

import java.time.LocalDate;

public class PreguntaTestDTO {
    private int idtest;
    private int CountPreguntas;

    public PreguntaTestDTO() {
    }

    public PreguntaTestDTO(int idtest, int countPreguntas) {
        this.idtest = idtest;
        CountPreguntas = countPreguntas;
    }

    public int getIdtest() {
        return idtest;
    }

    public void setIdtest(int idtest) {
        this.idtest = idtest;
    }

    public int getCountPreguntas() {
        return CountPreguntas;
    }

    public void setCountPreguntas(int countPreguntas) {
        CountPreguntas = countPreguntas;
    }
}
