package pe.edu.pe.benunathani.disponibilidad.entities;


import javax.persistence.*;
@Entity
@Table(name="rutinas_recreativas")
public class Rutinas_recreativas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre",length = 60, nullable = false)
    private String nombre;
    @Column(name = "descripcion",length = 100,nullable = false)
    private String descripcion;

    public Rutinas_recreativas() {
    }

    public Rutinas_recreativas(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
