package pe.edu.pe.benunathani.disponibilidad.dtos;

public class InformeTratamientoDTO {
    private String informeName;
    private int tratamientoCount;

    public InformeTratamientoDTO() {
    }
    public InformeTratamientoDTO(String informeName, int tratamientoCount) {
        this.informeName = informeName;
        this.tratamientoCount = tratamientoCount;
    }

    public String getInformeName() {
        return informeName;
    }

    public void setInformeName(String informeName) {
        this.informeName = informeName;
    }

    public int getTratamientoCount() {
        return tratamientoCount;
    }

    public void setTratamientoCount(int tratamientoCount) {
        this.tratamientoCount = tratamientoCount;
    }
}
