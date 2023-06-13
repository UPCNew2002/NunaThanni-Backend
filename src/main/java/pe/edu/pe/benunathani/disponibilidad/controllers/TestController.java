package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.TestDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Test;
import pe.edu.pe.benunathani.disponibilidad.services.ITestService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tests")
public class TestController {
    @Autowired
    private ITestService tS;
    @PostMapping
    public void insert(@RequestBody TestDTO dto) {
        ModelMapper m = new ModelMapper();
        Test t = m.map(dto, Test.class);
        tS.insert(t);
    }
    @GetMapping
    public List<TestDTO> list() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TestDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TestDTO listId(@PathVariable ("id") Integer id){
        ModelMapper m=new ModelMapper();
        TestDTO dto= m.map(tS.listId(id),TestDTO.class);
        return dto;
    }

    @PutMapping("/{id}")
    public void update (@RequestBody TestDTO dto){
        ModelMapper m=new ModelMapper();
        Test t =m.map(dto,Test.class);
        tS.insert(t);
    }
}
