package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "disponibilidades")
public class Disponibilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDisponibilidad;
    @Column(name = "inicio_turno", length = 5, nullable = false)
    private String inicio_turno;
    @Column(name = "fin_turno", length = 5, nullable = false)
    private String fin_turno;
    @Column(name = "dias_laborables", nullable = false)
    private String dias_laborables;

    public Disponibilidad() {
    }

    public Disponibilidad(int idDisponibilidad, String inicio_turno, String fin_turno, String dias_laborables) {
        this.idDisponibilidad = idDisponibilidad;
        this.inicio_turno = inicio_turno;
        this.fin_turno = fin_turno;
        this.dias_laborables = dias_laborables;
    }

    public int getIdDisponibilidad() {
        return idDisponibilidad;
    }

    public void setIdDisponibilidad(int idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public String getInicio_turno() {
        return inicio_turno;
    }

    public void setInicio_turno(String inicio_turno) {
        this.inicio_turno = inicio_turno;
    }

    public String getFin_turno() {
        return fin_turno;
    }

    public void setFin_turno(String fin_turno) {
        this.fin_turno = fin_turno;
    }

    public String getDias_laborables() {
        return dias_laborables;
    }

    public void setDias_laborables(String dias_laborables) {
        this.dias_laborables = dias_laborables;
    }
}
