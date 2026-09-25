package com.hexaport.domain.model.parents;

import com.hexaport.domain.model.enums.Category;
import com.hexaport.domain.model.enums.Difficulty;
import com.hexaport.domain.model.enums.Estados;

import java.util.Date;

public abstract class Challenge {
    private final long id;
    private String titulo;
    private String descripcion;
    private Category categoria;
    private Difficulty dificultad;
    private double xpPrize;
    private Date fechaCreacion;
    private Date fechaLimite;
    private Estados estado;

    public Challenge(long id, String titulo, String descripcion, Category categoria, Difficulty dificultad, double xpPrize, Date fechaCreacion, Date fechaLimite, Estados estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.dificultad = dificultad;
        this.xpPrize = xpPrize;
        this.fechaCreacion = fechaCreacion;
        this.fechaLimite = fechaLimite;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Category getCategoria() {
        return categoria;
    }

    public Difficulty getDificultad() {
        return dificultad;
    }

    public double getXpPrize() {
        return xpPrize;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public Estados getEstado() {
        return estado;
    }
}
