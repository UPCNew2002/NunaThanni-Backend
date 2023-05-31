package pe.edu.pe.benunathani.disponibilidad.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.benunathani.disponibilidad.entities.Psicologo;
import pe.edu.pe.benunathani.disponibilidad.repositories.IPsicologoRepository;
import pe.edu.pe.benunathani.disponibilidad.services.IPsicologoService;

import java.util.List;

@Service
public class PsicologoServiceImplement implements IPsicologoService {

    @Autowired
    private IPsicologoRepository pR;
    @Override
    public void insert(Psicologo psicologo) {
        pR.save(psicologo);
    }

    @Override
    public List<Psicologo> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPsicologo) {
        pR.deleteById(idPsicologo);
    }

    @Override
    public Psicologo listId(int idPsicologo) {
        return pR.findById(idPsicologo).orElse(new Psicologo());
    }

    @Override
    public List<Psicologo> find(String correo) {
         return pR.buscarCorreo(correo);
    }


}
