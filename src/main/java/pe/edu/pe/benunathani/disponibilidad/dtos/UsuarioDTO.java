package pe.edu.pe.benunathani.disponibilidad.dtos;

import javax.persistence.Column;

public class UsuarioDTO {
    private int idusuario;
    private String nameusuario;
    private String snameusuario;
    private String passusuario;
    private int telusuario;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNameusuario() {
        return nameusuario;
    }

    public void setNameusuario(String nameusuario) {
        this.nameusuario = nameusuario;
    }

    public String getSnameusuario() {
        return snameusuario;
    }

    public void setSnameusuario(String snameusuario) {
        this.snameusuario = snameusuario;
    }

    public String getPassusuario() {
        return passusuario;
    }

    public void setPassusuario(String passusuario) {
        this.passusuario = passusuario;
    }

    public int getTelusuario() {
        return telusuario;
    }

    public void setTelusuario(int telusuario) {
        this.telusuario = telusuario;
    }
}