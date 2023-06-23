package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name= "preguntas")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;
    @Column(name = "txtPregunta",length = 200,nullable = false)
    private String txtPregunta;

    @ManyToOne
    @JoinColumn(name ="idtest")
    private Test test;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, String txtPregunta, Test test) {
        this.idPregunta = idPregunta;
        this.txtPregunta = txtPregunta;
        this.test = test;
    }

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
