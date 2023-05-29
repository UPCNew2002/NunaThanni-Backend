package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.DisponibilidadDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Disponibilidad;
import pe.edu.pe.benunathani.disponibilidad.services.IDisponibilidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/disponibilidades")
public class DisponibilidadController {
    @Autowired
    private IDisponibilidadService pS;

    @PostMapping
    public void insert(@RequestBody DisponibilidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Disponibilidad d = m.map(dto, Disponibilidad.class);
        pS.insert(d);
    }

    @GetMapping
    public List<DisponibilidadDTO> list() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DisponibilidadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public DisponibilidadDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        DisponibilidadDTO dto=m.map(pS.listId(id),DisponibilidadDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody DisponibilidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Disponibilidad d = m.map(dto, Disponibilidad.class);
        pS.insert(d);
    }
}
