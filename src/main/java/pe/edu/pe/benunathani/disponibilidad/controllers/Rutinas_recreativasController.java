package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.Rutinas_recreativasDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Rutinas_recreativas;
import pe.edu.pe.benunathani.disponibilidad.services.IRutinas_recreativasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutinas_recreativas")
public class Rutinas_recreativasController {
    @Autowired
    private IRutinas_recreativasService rR;
    @PostMapping
    public void insert(@RequestBody Rutinas_recreativasDTO dto){
        ModelMapper m=new ModelMapper();
        Rutinas_recreativas r=m.map(dto,Rutinas_recreativas.class);
        rR.insert(r);
    }
    @GetMapping
    public List<Rutinas_recreativasDTO> List(){
        return rR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Rutinas_recreativasDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        rR.delete(id);
    }

    @GetMapping("/{id}")
    public Rutinas_recreativasDTO listId(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        Rutinas_recreativasDTO dto= m.map(rR.ListID(id),Rutinas_recreativasDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody Rutinas_recreativasDTO dto){
        ModelMapper m=new ModelMapper();
        Rutinas_recreativas r=m.map(dto,Rutinas_recreativas.class);
        rR.insert(r);
    }

}
