package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.PreguntaDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Pregunta;
import pe.edu.pe.benunathani.disponibilidad.services.IPreguntaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {
    @Autowired
    private IPreguntaService pS;
    @PostMapping
    public void insert(@RequestBody PreguntaDTO dto) {
        ModelMapper m = new ModelMapper();
        Pregunta p = m.map(dto, Pregunta.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PreguntaDTO> list() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PreguntaDTO listId(@PathVariable ("id") Integer id){
        ModelMapper m=new ModelMapper();
        PreguntaDTO dto= m.map(pS.listId(id),PreguntaDTO.class);
        return dto;
    }

    @PutMapping
    public void update (@RequestBody PreguntaDTO dto){
        ModelMapper m=new ModelMapper();
        Pregunta p=m.map(dto,Pregunta.class);
        pS.insert(p);
    }
}
