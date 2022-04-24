package edu.elp.siselp.Service.Impl;


import edu.elp.siselp.Service.IPersonaService;
import edu.elp.siselp.dao.IPersonaDao;
import edu.elp.siselp.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {
    @Autowired

    private IPersonaDao personaDao;

    @Override
    public List<Persona> ListaPersonas() {
        List<Persona> personaList =this.personaDao.findAll();
        for ( Persona persona :personaList){
            System.out.println(persona.toString());
        }
        return this.personaDao.findAll();

    }

    @Override
    public Persona obtenerPersonaByDni(String dni) {
        return this.personaDao.buscarPersona(dni);
    }

}
