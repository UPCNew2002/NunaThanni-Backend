package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;
@Entity
@Table(name = "opciones")
public class Opciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOpciones;
    @Column(name = "descripcionOpciones", length = 100, nullable = false)
    private String descripcionOpciones;
    @ManyToOne
    @JoinColumn(name = "idPreguntas")
    private Preguntas preguntas;

    public Opciones() {
    }

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
