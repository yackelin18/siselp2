package edu.elp.siselp.Service;

import edu.elp.siselp.entity.Docente;
import edu.elp.siselp.entity.Persona;

import java.util.List;

public interface IDocenteService {
    //Listar docente
    List<Docente> ListaDocente();

    //Buscar persona por su apellido
    Docente obtenerDocenteByDni(String apellido);
}
