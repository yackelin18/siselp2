package edu.elp.siselp.Service.Impl;


import edu.elp.siselp.Service.IAdministrativoService;
import edu.elp.siselp.dao.IAdministrativoDao;
import edu.elp.siselp.dao.IPersonaDao;
import edu.elp.siselp.entity.Administrativo;
import edu.elp.siselp.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrativoServiceImpl implements IAdministrativoService {
    @Autowired

    private IAdministrativoDao administrativoDao;

  @Override

    public List<Administrativo> ListaAdministrativo() {
        List<Administrativo> administrativoList =this.administrativoDao.findAll();
        for ( Administrativo  administrativo :administrativoList){
            System.out.println(administrativo.toString());
        }
        return this.administrativoDao.findAll();

    }

}
