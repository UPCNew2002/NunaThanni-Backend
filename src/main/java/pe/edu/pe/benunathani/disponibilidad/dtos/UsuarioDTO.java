package pe.edu.pe.benunathani.disponibilidad.dtos;

import javax.persistence.Column;

public class UsuarioDTO {
    private int idUsuario;
    private String nameUsuario;
    private String SnameUsuario;
    private String PassUsuario;
    private int telusuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getSnameUsuario() {
        return SnameUsuario;
    }

    public void setSnameUsuario(String snameUsuario) {
        SnameUsuario = snameUsuario;
    }

    public String getPassUsuario() {
        return PassUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        PassUsuario = passUsuario;
    }

    public int getTelusuario() {
        return telusuario;
    }

    public void setTelusuario(int telusuario) {
        this.telusuario = telusuario;
    }
}