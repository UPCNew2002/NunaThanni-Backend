package pe.edu.pe.benunathani.disponibilidad.services;

import java.util.List;

import pe.edu.pe.benunathani.disponibilidad.entities.Users;


public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();

}