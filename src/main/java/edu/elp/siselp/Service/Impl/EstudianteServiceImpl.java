package edu.elp.siselp.Service.Impl;


import edu.elp.siselp.Service.IEstudianteService;
import edu.elp.siselp.dao.IEstudianteDao;
import edu.elp.siselp.entity.Estudiante;
import edu.elp.siselp.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired

    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> ListaEstudiante() {
        List<Estudiante> estudianteList =this.estudianteDao.findAll();
        for ( Estudiante estudiante :estudianteList){
            System.out.println(estudiante.toString());
        }
        return this.estudianteDao.findAll();

    }
    @Override
    public Persona obtenerEstudianteByDni(String dni) {
        return this.estudianteDao.buscarEstudiante(dni);
    }
}
