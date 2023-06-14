package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Test;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;

public class InformeDTO {

    private int idInforme;
    private String resultado_testInforme;
    private Test test;
    private Tratamiento tratamiento;

    public int getIdInforme() {
        return idInforme;
    }

    public void setIdInforme(int idInforme) {
        this.idInforme = idInforme;
    }

    public String getResultado_testInforme() {
        return resultado_testInforme;
    }

    public void setResultado_testInforme(String resultado_testInforme) {
        this.resultado_testInforme = resultado_testInforme;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
}
