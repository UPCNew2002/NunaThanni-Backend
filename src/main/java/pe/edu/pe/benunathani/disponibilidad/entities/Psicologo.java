package pe.edu.pe.benunathani.disponibilidad.entities;

import javax.persistence.*;

@Entity
@Table(name = "psicologos")
public class Psicologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPsicologo;
    @Column(name = "correoPsicologo",length = 40,nullable = false)
    private String correoPsicologo;
    @Column(name = "fotoPsicologo",nullable = false)
    private String fotoPsicologo;

    @ManyToOne
    @JoinColumn(name = "idEspecialidad")
    private Especialidad especialidad;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idDisponibilidad")
    private Disponibilidad disponibilidad;

    public Psicologo() {
    }

    public Psicologo(int idPsicologo, String correoPsicologo, String fotoPsicologo, Especialidad especialidad, Usuario usuario, Disponibilidad disponibilidad) {
        this.idPsicologo = idPsicologo;
        this.correoPsicologo = correoPsicologo;
        this.fotoPsicologo = fotoPsicologo;
        this.especialidad = especialidad;
        this.usuario = usuario;
        this.disponibilidad = disponibilidad;
    }

    public int getIdPsicologo() {
        return idPsicologo;
    }

    public void setIdPsicologo(int idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public String getCorreoPsicologo() {
        return correoPsicologo;
    }

    public void setCorreoPsicologo(String correoPsicologo) {
        this.correoPsicologo = correoPsicologo;
    }

    public String getFotoPsicologo() {
        return fotoPsicologo;
    }

    public void setFotoPsicologo(String fotoPsicologo) {
        this.fotoPsicologo = fotoPsicologo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
