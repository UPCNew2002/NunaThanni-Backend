package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.dtos.PreguntaTestDTO;
import pe.edu.pe.benunathani.disponibilidad.dtos.RutinaTratamientoDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Test;
import pe.edu.pe.benunathani.disponibilidad.repositories.ITestRepository;
import pe.edu.pe.benunathani.disponibilidad.services.ITestService;

import java.util.ArrayList;
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

    @Override
    public List<PreguntaTestDTO> reporteTest() {

        List<String[]> preguntaCountByTest = tR.getPreguntasCountByTest();
        List<PreguntaTestDTO> preguntaTestDTOS = new ArrayList<>();

        for (String[] data : preguntaCountByTest) {
            PreguntaTestDTO dto = new PreguntaTestDTO();
            dto.setIdtest(Integer.parseInt(data[0]));
            dto.setCountPreguntas(Integer.parseInt(data[1]));
            preguntaTestDTOS.add(dto);
        }

        return preguntaTestDTOS;
    }
}
