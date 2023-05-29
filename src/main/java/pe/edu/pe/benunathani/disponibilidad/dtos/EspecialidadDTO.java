package pe.edu.pe.benunathani.disponibilidad.dtos;

public class EspecialidadDTO {

    private int idEspecialidad;
    private String  tipoEspecialidad;
    private String  centroEspecialidad;
    private String  descripcionEspecialidad;

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
