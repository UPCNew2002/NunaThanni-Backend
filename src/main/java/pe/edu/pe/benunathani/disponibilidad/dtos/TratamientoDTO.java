package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Rutinas_recreativas;

public class TratamientoDTO {
    private int idTratamiento;
    private String temaTratamiento;
    private String descripcionTratamiento;

    private Rutinas_recreativas rutinas_recreativas;

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
