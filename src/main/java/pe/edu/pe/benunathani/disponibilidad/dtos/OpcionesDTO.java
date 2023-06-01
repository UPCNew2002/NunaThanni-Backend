package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Preguntas;

public class OpcionesDTO {
    private int idOpciones;
    private String descripcionOpciones;
    private Preguntas preguntas;

    public int getIdOpciones() {
        return idOpciones;
    }

    public void setIdOpciones(int idOpciones) {
        this.idOpciones = idOpciones;
    }

    public String getDescripcionOpciones() {
        return descripcionOpciones;
    }

    public void setDescripcionOpciones(String descripcionOpciones) {
        this.descripcionOpciones = descripcionOpciones;
    }

    public Preguntas getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas preguntas) {
        this.preguntas = preguntas;
    }
}
