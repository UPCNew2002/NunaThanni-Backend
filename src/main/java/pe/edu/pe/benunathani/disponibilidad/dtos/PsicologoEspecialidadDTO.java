package pe.edu.pe.benunathani.disponibilidad.dtos;

public class PsicologoEspecialidadDTO {

    private String psicologoName;
    private int especialidadCount;

    public PsicologoEspecialidadDTO() {
    }

    public PsicologoEspecialidadDTO(String psicologoName, int especialidadCount) {
        this.psicologoName = psicologoName;
        this.especialidadCount = especialidadCount;
    }

    public String getPsicologoName() {
        return psicologoName;
    }

    public void setPsicologoName(String psicologoName) {
        this.psicologoName = psicologoName;
    }

    public int getEspecialidadCount() {
        return especialidadCount;
    }

    public void setEspecialidadCount(int especialidadCount) {
        this.especialidadCount = especialidadCount;
    }
}
