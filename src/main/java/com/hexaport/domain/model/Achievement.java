package com.hexaport.domain.model;

public class Achievement {
    private long id;
    private String code;
    private String nombre;
    private String descripcion;

    public Achievement(long id, String code, String nombre, String descripcion) {
        this.id = id;
        this.code = code;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
