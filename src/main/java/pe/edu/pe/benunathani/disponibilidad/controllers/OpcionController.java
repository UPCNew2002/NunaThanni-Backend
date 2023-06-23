package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.OpcionDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Opcion;
import pe.edu.pe.benunathani.disponibilidad.services.IOpcionService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/opciones")
public class OpcionController {

    @Autowired
    private IOpcionService oS;

    @PostMapping
    public void insert(@RequestBody OpcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Opcion o = m.map(dto, Opcion.class);
        oS.insert(o);
    }
    @GetMapping
    public List<OpcionDTO> list() {
        return oS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, OpcionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        oS.delete(id);
    }

    @GetMapping("/{id}")
    public OpcionDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        OpcionDTO dto=m.map(oS.listId(id),OpcionDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody OpcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Opcion o = m.map(dto, Opcion.class);
        oS.insert(o);
    }

    @GetMapping("/buscar-por-descripcion/{descripcion}")
    public List<OpcionDTO> buscarPorDescripcion(@PathVariable("descripcion") String descripcion) {
        return oS.buscarDescripcion(descripcion).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, OpcionDTO.class);
        }).collect(Collectors.toList());
    }
}
