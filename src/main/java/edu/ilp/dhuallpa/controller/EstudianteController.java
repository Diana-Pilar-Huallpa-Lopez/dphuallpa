package edu.ilp.dhuallpa.controller;

import edu.ilp.dhuallpa.dao.IEstudianteDao;
import edu.ilp.dhuallpa.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class EstudianteController {
    @Autowired
    private IEstudianteDao estudianteService;


    //Buscar un estudiante por su código
    @GetMapping( "/buscarEstudianteBycodigo" )
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo) {
        return this.estudianteService.obtenerEstudiantePorCodigo (codigo);
    }
}
