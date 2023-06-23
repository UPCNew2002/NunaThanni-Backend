package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.PacienteDTO;
import pe.edu.pe.benunathani.disponibilidad.dtos.PacienteUsuarioDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Paciente;
import pe.edu.pe.benunathani.disponibilidad.services.IPacienteService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService pS;
    @PostMapping
    public void insert(@RequestBody PacienteDTO dto){
        ModelMapper m= new ModelMapper();
        Paciente p = m.map(dto, Paciente.class);
        pS.insert(p);
    }
    @GetMapping
    public List<PacienteDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PacienteDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscar")
    public List<PacienteDTO> search(@RequestBody LocalDate fecha){
        return pS.find(fecha).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PacienteDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/paciente-count")
    public List<PacienteUsuarioDTO> getnombresynacimientos() {
        List<PacienteUsuarioDTO> pacienteUsuarioDTOS = pS.reportefechasPaciente();
        return pacienteUsuarioDTOS;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        pS.delete(id);
    }
    @GetMapping("/{id}")
    public PacienteDTO listId(@PathVariable ("id") Integer id){
        ModelMapper m=new ModelMapper();
        PacienteDTO dto= m.map(pS.listId(id),PacienteDTO.class);
        return dto;
    }

    @PutMapping("/{id}")
    public void update (@RequestBody PacienteDTO dto){
        ModelMapper m=new ModelMapper();
        Paciente p=m.map(dto,Paciente.class);
        pS.insert(p);
    }
}
