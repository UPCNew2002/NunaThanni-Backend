package pe.edu.pe.benunathani.disponibilidad.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class DisponibilidadDTO {
    private int idDisponibilidad;
    private String inicio_turno;
    private String fin_turno;
    private String dias_laborables;

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
