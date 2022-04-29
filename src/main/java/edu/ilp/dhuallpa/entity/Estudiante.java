package edu.ilp.dhuallpa.entity;

import javax.persistence.*;

@Entity
@Table (name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
public class Estudiante extends Persona {

    @Column(name = "codigo", length = 100, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 100, nullable = false)
    private String serie;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idPersona, String nombre, String telefono, String email, String codigo, String serie) {
        super (idPersona, nombre, telefono, email);
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
