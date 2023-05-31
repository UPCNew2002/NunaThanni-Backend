package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Test;
import pe.edu.pe.benunathani.disponibilidad.repositories.ITestRepository;
import pe.edu.pe.benunathani.disponibilidad.services.ITestService;

import java.util.List;

@Service
public class TestServiceImplement implements ITestService {
    @Autowired
    private ITestRepository tR;


    @Override
    public void insert(Test test) {
        tR.save(test);
    }

    @Override
    public List<Test> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTest) {
        tR.deleteById(idTest);
    }

    @Override
    public Test listId(int idTest) {
        return tR.findById(idTest).orElse(new Test());
    }
}
