package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.CitaDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Cita;
import pe.edu.pe.benunathani.disponibilidad.services.ICitaService;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    private ICitaService cS;

    @PostMapping
    public void insert(@RequestBody CitaDTO dto) {
        ModelMapper m = new ModelMapper();
        Cita c = m.map(dto, Cita.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CitaDTO> list() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscar")
    public List<CitaDTO> search(@RequestBody LocalDate fecha) {
        return cS.find(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CitaDTO listId(@PathVariable ("id") Integer id){
        ModelMapper m=new ModelMapper();
        CitaDTO dto= m.map(cS.listId(id),CitaDTO.class);
        return dto;
    }

    @PutMapping
    public void update (@RequestBody CitaDTO dto){
        ModelMapper m=new ModelMapper();
        Cita c=m.map(dto,Cita.class);
        cS.insert(c);
    }

    @GetMapping("/Contador")
    public ResponseEntity<Map<String, Long>> contador(){
        long contador = cS.ContarFecha();
        Map<String, Long> earesponse = new HashMap<>();
        earesponse.put("cantidad", contador);
        return ResponseEntity.ok(earesponse);
    }
}
