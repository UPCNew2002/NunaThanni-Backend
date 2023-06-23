package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name = "opciones")
public class Opcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOpcion;
    @Column(name = "descripcionOpcion", length = 100, nullable = false)
    private String descripcionOpcion;
    @ManyToOne
    @JoinColumn(name = "idPregunta")
    private Pregunta pregunta;

    public Opcion() {
    }

    public Opcion(int idOpcion, String descripcionOpcion, Pregunta pregunta) {
        this.idOpcion = idOpcion;
        this.descripcionOpcion = descripcionOpcion;
        this.pregunta = pregunta;
    }

    public int getIdOpcion() {
        return idOpcion;
    }

    public void setIdOpcion(int idOpcion) {
        this.idOpcion = idOpcion;
    }

    public String getDescripcionOpcion() {
        return descripcionOpcion;
    }

    public void setDescripcionOpcion(String descripcionOpcion) {
        this.descripcionOpcion = descripcionOpcion;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
}
