package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name = "tratamiento")
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTratamiento;
    @Column(name = "temaTratamiento",length = 40,nullable = false)
    private String temaTratamiento;
    @Column(name = "descripcionTratamiento",length = 100,nullable = false)
    private String descripcionTratamiento;

    @ManyToOne
    @JoinColumn(name = "id")
    private Rutinas_recreativas rutinas_recreativas;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String temaTratamiento, String descripcionTratamiento, Rutinas_recreativas rutinas_recreativas) {
        this.idTratamiento = idTratamiento;
        this.temaTratamiento = temaTratamiento;
        this.descripcionTratamiento = descripcionTratamiento;
        this.rutinas_recreativas = rutinas_recreativas;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTemaTratamiento() {
        return temaTratamiento;
    }

    public void setTemaTratamiento(String temaTratamiento) {
        this.temaTratamiento = temaTratamiento;
    }

    public String getDescripcionTratamiento() {
        return descripcionTratamiento;
    }

    public void setDescripcionTratamiento(String descripcionTratamiento) {
        this.descripcionTratamiento = descripcionTratamiento;
    }

    public Rutinas_recreativas getRutinas_recreativas() {
        return rutinas_recreativas;
    }

    public void setRutinas_recreativas(Rutinas_recreativas rutinas_recreativas) {
        this.rutinas_recreativas = rutinas_recreativas;
    }
}
