package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario listId(int idUsuario);
}
