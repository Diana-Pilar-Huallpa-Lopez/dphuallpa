package edu.ilp.dhuallpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "direccion")
public class Direccion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDireccion", length = 10)
    private Long idDireccion;

    @Column(name = "calle", length = 100, nullable = false)
    private String calle;

    @Column(name = "ciudad", length = 100, nullable = false)
    private String ciudad;

    @Column(name = "estado", length = 100, nullable = false)
    private String estado;

    @Column(name = "codigopostal", length = 100, nullable = false)
    private String codigopostal;

    @Column(name = "pais", length = 100, nullable = false)
    private String pais;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Persona persona;

    public Direccion() {
    }

    public Direccion(Long idDireccion, String calle, String ciudad, String estado, String codigopostal, String pais, Persona persona) {
        this.idDireccion = idDireccion;
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigopostal = codigopostal;
        this.pais = pais;

    }

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }



}
