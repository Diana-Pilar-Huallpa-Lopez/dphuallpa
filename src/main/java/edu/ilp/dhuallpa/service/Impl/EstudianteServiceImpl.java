package edu.ilp.dhuallpa.service.Impl;

import edu.ilp.dhuallpa.dao.IPersonaDao;
import edu.ilp.dhuallpa.entity.Estudiante;
import edu.ilp.dhuallpa.service.Intef.IEstudianteServiceIntef;
import org.springframework.beans.factory.annotation.Autowired;

public class EstudianteServiceImpl implements IEstudianteServiceIntef {

    @Autowired
    private IPersonaDao estudianteDao;

    @Override
    public Estudiante obtenerEstudiantePorCodigo(String codigo) {
        return this.obtenerEstudiantePorCodigo(codigo);
    }
}
