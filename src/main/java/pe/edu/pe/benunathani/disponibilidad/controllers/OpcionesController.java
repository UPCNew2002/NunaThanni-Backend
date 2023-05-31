package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.OpcionesDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Opciones;
import pe.edu.pe.benunathani.disponibilidad.services.IOpcionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/opciones")
public class OpcionesController {

    @Autowired
    private IOpcionesService oS;

    @PostMapping
    public void insert(@RequestBody OpcionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Opciones o = m.map(dto, Opciones.class);
        oS.insert(o);
    }
    @GetMapping
    public List<OpcionesDTO> list() {
        return oS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, OpcionesDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        oS.delete(id);
    }

    @GetMapping("/{id}")
    public OpcionesDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        OpcionesDTO dto=m.map(oS.listId(id),OpcionesDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody OpcionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Opciones o = m.map(dto, Opciones.class);
        oS.insert(o);
    }

    @GetMapping("/buscar-por-descripcion/{descripcion}")
    public List<OpcionesDTO> buscarPorDescripcion(@PathVariable("descripcion") String descripcion) {
        return oS.buscarDescripcion(descripcion).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, OpcionesDTO.class);
        }).collect(Collectors.toList());
    }
}
