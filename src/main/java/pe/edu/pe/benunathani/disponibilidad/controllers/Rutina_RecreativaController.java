package pe.edu.pe.benunathani.disponibilidad.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.Rutina_RecreativaDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Rutina_Recreativa;
import pe.edu.pe.benunathani.disponibilidad.services.IRutina_RecreativaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Rutinas_recreativas")
public class Rutina_RecreativaController {
    @Autowired
    private IRutina_RecreativaService rR;
    @PostMapping
    public void insert(@RequestBody Rutina_RecreativaDTO dto){
        ModelMapper m=new ModelMapper();
        Rutina_Recreativa r=m.map(dto,Rutina_Recreativa.class);
        rR.insert(r);
    }
    @GetMapping
    public List<Rutina_RecreativaDTO> List(){
        return rR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Rutina_RecreativaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        rR.delete(id);
    }

    @GetMapping("/{id}")
    public Rutina_RecreativaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        Rutina_RecreativaDTO dto= m.map(rR.ListID(id),Rutina_RecreativaDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody Rutina_RecreativaDTO dto){
        ModelMapper m=new ModelMapper();
        Rutina_Recreativa r=m.map(dto,Rutina_Recreativa.class);
        rR.insert(r);
    }

}