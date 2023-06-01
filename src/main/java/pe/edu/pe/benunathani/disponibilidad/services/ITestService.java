package pe.edu.pe.benunathani.disponibilidad.services;

import pe.edu.pe.benunathani.disponibilidad.entities.Test;

import java.util.List;

public interface ITestService {
    public void insert (Test test);
    List<Test> list();
    public void delete (int idTest);
    public Test listId(int idTest);
}
