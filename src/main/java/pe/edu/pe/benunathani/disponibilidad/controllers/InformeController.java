package pe.edu.pe.benunathani.disponibilidad.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.benunathani.disponibilidad.dtos.InformeDTO;
import pe.edu.pe.benunathani.disponibilidad.dtos.OpcionesDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Informe;
import pe.edu.pe.benunathani.disponibilidad.entities.Opciones;
import pe.edu.pe.benunathani.disponibilidad.services.IInformeService;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping( "/informes")
public class InformeController {
    @Autowired
    private IInformeService iS;
    @PostMapping
    public void insert (@RequestBody InformeController dto){
        ModelMapper m=new ModelMapper();
        Informe e=m.map(dto,Informe.class);
        iS.insert(e);
    }
    @GetMapping
    public List<InformeDTO> list(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,InformeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        iS.delete(id);
    }

    @GetMapping("/{id}")
    public InformeDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        InformeDTO dtos= m.map(iS.listId(id),InformeDTO.class);
        return dtos;
    }

    @PutMapping
    public void update(@RequestBody InformeDTO dto) {
        ModelMapper m = new ModelMapper();
        Informe o = m.map(dto, Informe.class);
        iS.insert(o);
    }
}
