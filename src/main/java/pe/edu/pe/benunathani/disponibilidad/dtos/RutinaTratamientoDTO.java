package pe.edu.pe.benunathani.disponibilidad.dtos;

public class RutinaTratamientoDTO {
    private String tratamientoName;
    private int rutinaCount;

    public RutinaTratamientoDTO() {
    }

    public RutinaTratamientoDTO(String tratamientoName, int rutinaCount) {
        this.tratamientoName = tratamientoName;
        this.rutinaCount = rutinaCount;
    }

    public String getTratamientoName() {
        return tratamientoName;
    }

    public void setTratamientoName(String tratamientoName) {
        this.tratamientoName = tratamientoName;
    }

    public int getRutinaCount() {
        return rutinaCount;
    }

    public void setRutinaCount(int rutinaCount) {
        this.rutinaCount = rutinaCount;
    }
}
