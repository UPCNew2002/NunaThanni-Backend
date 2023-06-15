package pe.edu.pe.benunathani.disponibilidad.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.pe.benunathani.disponibilidad.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}