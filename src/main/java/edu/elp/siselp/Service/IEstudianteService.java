package edu.elp.siselp.Service;

import edu.elp.siselp.entity.Estudiante;
import edu.elp.siselp.entity.Persona;

import java.util.List;

public interface IEstudianteService {
    //Listar estudiante
    List<Estudiante> ListaEstudiante();

    //Buscar estudiante por su dni
    Persona obtenerEstudianteByDni(String dni);
}
