package edu.elp.siselp.dao;


import edu.elp.siselp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
    @Query("SELECT p FROM Persona p WHERE p.dni=?1")
    Persona  buscarPersona(String dni);
}
