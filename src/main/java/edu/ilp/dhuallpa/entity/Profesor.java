package edu.ilp.dhuallpa.entity;

import javax.persistence.*;

@Entity
@Table (name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
public class Profesor extends Persona{


    @Column(name = "salario", length = 100, nullable = false)
    private Double salario;

    public Profesor() {
    }

    public Profesor(Double salario) {
        this.salario = salario;
    }

    public Profesor(Long idPersona, String nombre, String telefono, String email, Double salario) {
        super (idPersona, nombre, telefono, email);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
