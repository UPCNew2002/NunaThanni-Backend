package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idusuario;
    @Column(name = "nameusuario", length = 20, nullable = false)
    private String nameusuario;
    @Column(name = "snameusuario", length = 20, nullable = false)
    private String snameusuario;
    @Column(name = "passusuario", length = 30, nullable = false)
    private String passusuario;
    @Column(name = "telusuario", length = 9, nullable = false)
    private int telusuario;

    public Usuario() {
    }

    public Usuario(int idusuario, String nameusuario, String snameusuario, String passusuario, int telusuario) {
        this.idusuario = idusuario;
        this.nameusuario = nameusuario;
        this.snameusuario = snameusuario;
        this.passusuario = passusuario;
        this.telusuario = telusuario;
    }

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