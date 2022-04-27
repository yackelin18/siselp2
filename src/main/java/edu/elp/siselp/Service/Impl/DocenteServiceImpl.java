package edu.elp.siselp.Service.Impl;


import edu.elp.siselp.Service.IDocenteService;
import edu.elp.siselp.dao.IDocenteDao;
import edu.elp.siselp.entity.Docente;
import edu.elp.siselp.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DocenteServiceImpl implements IDocenteService {
    @Autowired
    private IDocenteDao docenteDao;
    @Override
    public List<Docente> ListaDocente() {
        List<Docente> docenteList =this.docenteDao.findAll();
        for ( Docente docente :docenteList){
            System.out.println(docente.toString());
        }
        return this.docenteDao.findAll();

    }

    @Override
    public Docente obtenerDocenteByDni(String apellido) {
        return null;
    }

}
