package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name ="informes")
public class Informe {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idInforme;
    @Column(name ="resultado_testInforme", length = 30,nullable=false)
    private String resultado_testInforme;

    @OneToOne
        @JoinColumn(name = "idTest")
        private Test test;

    @OneToOne
    @JoinColumn(name = "idTratamiento")
    private Tratamiento tratamiento;
    public Informe() {
    }

    public Informe(int idInforme, String resultado_testInforme, Test test, Tratamiento tratamiento) {
        this.idInforme = idInforme;
        this.resultado_testInforme = resultado_testInforme;
        this.test = test;
        this.tratamiento = tratamiento;
    }

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
