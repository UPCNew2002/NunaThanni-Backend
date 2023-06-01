package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.TratamientoDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;
import pe.edu.pe.benunathani.disponibilidad.services.ITratamientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tratamientos")
public class TratamientoController {

    @Autowired
    private ITratamientoService tS;

    @PostMapping
    public void insert(@RequestBody TratamientoDTO dto) {
        ModelMapper m = new ModelMapper();
        Tratamiento v = m.map(dto, Tratamiento.class);
        tS.insert(v);
    }

    @GetMapping
    public List<TratamientoDTO> list() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TratamientoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TratamientoDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TratamientoDTO dto = m.map(tS.listId(id), TratamientoDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody TratamientoDTO dto) {
        ModelMapper m = new ModelMapper();
        Tratamiento p = m.map(dto, Tratamiento.class);
        tS.insert(p);
    }

    @GetMapping("/buscar-por-tema/{tema}")
    public List<TratamientoDTO> buscarPorTema(@PathVariable("tema") String tema) {
        return tS.buscarTema(tema).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TratamientoDTO.class);
        }).collect(Collectors.toList());
    }
}