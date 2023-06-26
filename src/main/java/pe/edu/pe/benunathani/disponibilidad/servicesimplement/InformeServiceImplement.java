package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.dtos.InformeTratamientoDTO;
import pe.edu.pe.benunathani.disponibilidad.dtos.RutinaTratamientoDTO;
import pe.edu.pe.benunathani.disponibilidad.entities.Informe;
import pe.edu.pe.benunathani.disponibilidad.entities.Psicologo;
import pe.edu.pe.benunathani.disponibilidad.repositories.IInformeRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IInformeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class InformeServiceImplement implements IInformeService {

    @Autowired
    private IInformeRepository iR;
    @Override
    public void insert(Informe informe) {iR.save(informe);}

    @Override
    public List<Informe> list(){
        return iR.findAll();
    }

    @Override
    public void delete(int idInforme) {
        iR.deleteById(idInforme);
    }

    @Override
    public Informe listId(int idInforme) {
        return iR.findById(idInforme).orElse(new Informe());
    }

    @Override
    public List<Informe> find(String resultado) {
        return iR.buscarResultado(resultado);
    }

    @Override
    public List<InformeTratamientoDTO> reporte_informe() {
        List<String[]> tratamientoCountByInforme = iR.getTratamientoCountByInforme();
        List<InformeTratamientoDTO> informeTratamientoDTOS = new ArrayList<>();

        for (String[] data : tratamientoCountByInforme) {
            InformeTratamientoDTO dto = new InformeTratamientoDTO();
            dto.setInformeName(data[0]);
            dto.setTratamientoCount(Integer.parseInt(data[1]));
            informeTratamientoDTOS.add(dto);
        }

        return informeTratamientoDTOS;
    }
}
