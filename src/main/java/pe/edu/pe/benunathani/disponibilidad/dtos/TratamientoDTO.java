package pe.edu.pe.benunathani.disponibilidad.dtos;

import pe.edu.pe.benunathani.disponibilidad.entities.Rutina_Recreativa;



public class TratamientoDTO {

    private int idTratamiento;
    private String temaTratamiento;
    private String descripcionTratamiento;

    private Rutina_Recreativa rutina_recreativa;

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
