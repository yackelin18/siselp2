package edu.elp.siselp.Service;
import edu.elp.siselp.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Listar personas
    List<Persona> ListaPersonas();

    //Buscar persona por su dni
    Persona obtenerPersonaByDni(String dni);


}
