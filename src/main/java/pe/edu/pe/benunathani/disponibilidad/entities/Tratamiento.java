package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name = "tratamientos")
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
    private Rutina_Recreativa rutina_recreativa;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String temaTratamiento, String descripcionTratamiento, Rutina_Recreativa rutina_recreativa) {
        this.idTratamiento = idTratamiento;
        this.temaTratamiento = temaTratamiento;
        this.descripcionTratamiento = descripcionTratamiento;
        this.rutina_recreativa = rutina_recreativa;
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

    public Rutina_Recreativa getRutina_recreativa() {
        return rutina_recreativa;
    }

    public void setRutina_recreativa(Rutina_Recreativa rutina_recreativa) {
        this.rutina_recreativa = rutina_recreativa;
    }
}
