package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name = "especialidades")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialidad;
    @Column(name = "tipoEspecialidad", length = 40,nullable = false)
    private String  tipoEspecialidad;
    @Column(name = "centroEspecialidad", length = 40,nullable = false)
    private String  centroEspecialidad;
    @Column(name = "descripcionEspecialidad", length = 60,nullable = false)
    private String  descripcionEspecialidad;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String tipoEspecialidad, String centroEspecialidad, String descripcionEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.tipoEspecialidad = tipoEspecialidad;
        this.centroEspecialidad = centroEspecialidad;
        this.descripcionEspecialidad = descripcionEspecialidad;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public String getCentroEspecialidad() {
        return centroEspecialidad;
    }

    public void setCentroEspecialidad(String centroEspecialidad) {
        this.centroEspecialidad = centroEspecialidad;
    }

    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }

    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }
}
