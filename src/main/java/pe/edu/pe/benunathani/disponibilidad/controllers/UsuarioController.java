package pe.edu.pe.benunathani.disponibilidad.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.UsuarioDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Usuario;
import pe.edu.pe.benunathani.disponibilidad.services.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @PostMapping
    public void insert(@RequestBody UsuarioDTO dto){
        ModelMapper m= new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }
    @GetMapping
    public List<UsuarioDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        uS.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO ListId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.listId(id),UsuarioDTO.class);
        return dto;
    }
    @PutMapping("/{id}")
    public void update(@RequestBody UsuarioDTO dto){
        ModelMapper m= new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }
}
