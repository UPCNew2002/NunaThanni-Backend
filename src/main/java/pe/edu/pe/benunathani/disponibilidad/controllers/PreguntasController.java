package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.PreguntasDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Preguntas;
import pe.edu.pe.benunathani.disponibilidad.services.IPreguntasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/preguntas")
public class PreguntasController {
    @Autowired
    private IPreguntasService prS;

    @PostMapping
    public void insert(@RequestBody PreguntasDTO dto) {
        ModelMapper m = new ModelMapper();
        Preguntas pr = m.map(dto, Preguntas.class);
        prS.insert(pr);
    }

    @GetMapping
    public List<PreguntasDTO> list() {
        return prS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreguntasDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        prS.delete(id);
    }

    @GetMapping("/{id}")
    public PreguntasDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PreguntasDTO dto=m.map(prS.listId(id),PreguntasDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody PreguntasDTO dto) {
        ModelMapper m = new ModelMapper();
        Preguntas pr = m.map(dto, Preguntas.class);
        prS.insert(pr);
    }
}
