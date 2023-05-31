package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nameUsuario", length = 20, nullable = false)
    private String nameUsuario;
    @Column(name = "SnameUsuario", length = 20, nullable = false)
    private String SnameUsuario;
    @Column(name = "PassUsuario", length = 30, nullable = false)
    private String PassUsuario;
    @Column(name = "telusuario", length = 9, nullable = false)
    private int telusuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nameUsuario, String snameUsuario, String passUsuario, int telusuario) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        SnameUsuario = snameUsuario;
        PassUsuario = passUsuario;
        this.telusuario = telusuario;
    }

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