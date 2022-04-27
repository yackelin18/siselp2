package edu.elp.siselp.dao;

import edu.elp.siselp.entity.Administrativo;
import edu.elp.siselp.entity.Docente;
import edu.elp.siselp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdministrativoDao extends JpaRepository<Administrativo,Long> {
    Administrativo FindByNombre(String nombre);
}
