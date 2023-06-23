package pe.edu.pe.benunathani.disponibilidad.dtos;

import java.util.Date;

public class PacienteUsuarioDTO {
    private String Usuarioname;
    private Date nacimiento;

    public PacienteUsuarioDTO() {
    }

    public PacienteUsuarioDTO(String usuarioname, Date nacimiento) {
        Usuarioname = usuarioname;
        this.nacimiento = nacimiento;
    }

    public String getUsuarioname() {
        return Usuarioname;
    }

    public void setUsuarioname(String usuarioname) {
        Usuarioname = usuarioname;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
}
