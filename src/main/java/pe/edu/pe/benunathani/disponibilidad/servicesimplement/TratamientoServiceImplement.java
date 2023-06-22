package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.dtos.RutinaTratamientoDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Tratamiento;
import pe.edu.pe.benunathani.disponibilidad.repositories.ITratamientoRepository;
import pe.edu.pe.benunathani.disponibilidad.services.ITratamientoService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TratamientoServiceImplement implements ITratamientoService {

    @Autowired
    private ITratamientoRepository tR;
    @Override
    public void insert(Tratamiento tratamiento) {
        tR.save(tratamiento);
    }

    @Override
    public List<Tratamiento> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTratamiento) {
        tR.deleteById(idTratamiento);
    }

    @Override
    public Tratamiento listId(int idTratamiento) {
        return tR.findById(idTratamiento).orElse(new Tratamiento());
    }

    @Override
    public List<Tratamiento> buscarTema(String temaTratamiento) {
        return tR.findBytemaTratamiento(temaTratamiento);
    }

    @Override
    public List<RutinaTratamientoDTO> reporte_tratamiento() {
        List<String[]> rutinaCountByTratamiento = tR.getRutinaCountByTratamiento();
        List<RutinaTratamientoDTO> rutinaTratamientoDTOs = new ArrayList<>();

        for (String[] data : rutinaCountByTratamiento) {
            RutinaTratamientoDTO dto = new RutinaTratamientoDTO();
            dto.setTratamientoName(data[0]);
            dto.setRutinaCount(Integer.parseInt(data[1]));
            rutinaTratamientoDTOs.add(dto);
        }

        return rutinaTratamientoDTOs;
    }
}
