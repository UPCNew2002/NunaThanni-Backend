package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.PsicologoDTO;
import pe.edu.pe.benunathani.disponibilidad.dtos.PsicologoEspecialidadDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Psicologo;
import pe.edu.pe.benunathani.disponibilidad.services.IPsicologoService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/psicologos")
public class PsicologoController {
    @Autowired
    private IPsicologoService pS;


    @PostMapping
    public void insert(@RequestBody PsicologoDTO dto) {
        ModelMapper m = new ModelMapper();
        Psicologo p = m.map(dto, Psicologo.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PsicologoDTO> list() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PsicologoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PsicologoDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PsicologoDTO dto=m.map(pS.listId(id),PsicologoDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody PsicologoDTO dto) {
        ModelMapper m = new ModelMapper();
        Psicologo p = m.map(dto, Psicologo.class);
        pS.insert(p);
    }

    @PostMapping("/buscar")
    public List<PsicologoDTO> search(@RequestBody String correo) {
        return pS.find(correo).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PsicologoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/especialidad-count")
    public List<PsicologoEspecialidadDTO> getEspecialidadByCountPsicologo() {
        List<PsicologoEspecialidadDTO> psicologoEspecialidadDTOS =pS.reporte_especialidad();
        return psicologoEspecialidadDTOS;
    }

}
