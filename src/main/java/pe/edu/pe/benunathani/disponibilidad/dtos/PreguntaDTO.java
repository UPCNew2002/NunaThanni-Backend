package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Test;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PreguntaDTO {
    private int idPregunta;
    private String txtPregunta;
    private Test test;

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getTxtPregunta() {
        return txtPregunta;
    }

    public void setTxtPregunta(String txtPregunta) {
        this.txtPregunta = txtPregunta;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
