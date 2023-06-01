package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;
@Entity
@Table(name = "preguntas")
public class Preguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPreguntas;
    @Column(name = "textoPaciente", length = 100, nullable = false)
    private String textoPaciente;

    public Preguntas() {
    }

    public Preguntas(int idPreguntas, String textoPaciente) {
        this.idPreguntas = idPreguntas;
        this.textoPaciente = textoPaciente;
    }

    public int getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(int idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public String getTextoPaciente() {
        return textoPaciente;
    }

    public void setTextoPaciente(String textoPaciente) {
        this.textoPaciente = textoPaciente;
    }
}
