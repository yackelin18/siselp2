package edu.elp.siselp.dao;

import edu.elp.siselp.entity.Docente;
import edu.elp.siselp.entity.Estudiante;
import edu.elp.siselp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
    @Query("SELECT p FROM Estudiante p WHERE p.dni=?1")
    Estudiante  buscarEstudiante (String dni);
}
