package pe.edu.pe.benunathani.disponibilidad.entities;


import javax.persistence.*;

@Entity
@Table(name = "Estados")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;
    @Column(name ="dispEstado",length = 30,nullable = false)
    private String dispEstado;

    public Estado() {
    }

    public Estado(int idEstado, String dispEstado) {
        this.idEstado = idEstado;
        this.dispEstado = dispEstado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDispEstado() {
        return dispEstado;
    }

    public void setDispEstado(String dispEstado) {
        this.dispEstado = dispEstado;
    }
}