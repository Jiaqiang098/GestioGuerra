package com.rauxasoft.gestionguerras.backend.business.model;

import java.util.Date;
import java.util.List;

public class Guerra {
    private Long id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> nacionesInvolucradas;
    private String resultado;

    // Constructor vacío
    public Guerra() {
    }

    // Constructor con todos los parámetros
    public Guerra(Long id, String nombre, Date fechaInicio, Date fechaFin, List<String> nacionesInvolucradas, String resultado) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nacionesInvolucradas = nacionesInvolucradas;
        this.resultado = resultado;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<String> getNacionesInvolucradas() {
        return nacionesInvolucradas;
    }

    public void setNacionesInvolucradas(List<String> nacionesInvolucradas) {
        this.nacionesInvolucradas = nacionesInvolucradas;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Guerra{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               ", fechaInicio=" + fechaInicio +
               ", fechaFin=" + fechaFin +
               ", nacionesInvolucradas=" + nacionesInvolucradas +
               ", resultado='" + resultado + '\'' +
               '}';
    }
}
