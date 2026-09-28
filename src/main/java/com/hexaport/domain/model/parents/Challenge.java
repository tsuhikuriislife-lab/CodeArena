package com.hexaport.domain.model.parents;

import com.hexaport.domain.exception.*;
import com.hexaport.domain.model.enums.Difficulty;
import com.hexaport.domain.model.enums.Estados;

import java.time.LocalDateTime;

public abstract class Challenge {
    private final long id;
    private String titulo;
    private String descripcion;
    private Category categoria;
    private Difficulty dificultad;
    private double xpPrize;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaLimite;
    private Estados estado;

    public Challenge(long id, String titulo, String descripcion, Category categoria, Difficulty dificultad, double xpPrize, LocalDateTime fechaCreacion, LocalDateTime fechaLimite, Estados estado) {
        if (id <= 0){
            throw new InvalidNumericValueException("id");
        }
        if (titulo == null || titulo.isBlank()){
            throw new InvalidValueException("titulo");
        }
        if (descripcion == null || descripcion.isBlank()){
            throw new InvalidValueException("descripcion");
        }
        if (categoria == null){
            throw new InvalidStatusException("Categoria");
        }
        if (dificultad == null){
            throw new InvalidStatusException("dificultad");
        }
        if (xpPrize <= 0){
            throw new InvalidNumericValueException("xp prize");
        }
        if (fechaCreacion == null){
            throw new InvalidDateValueException("sj");
        }
        if (fechaLimite == null){
            throw new InvalidDateValueException("jsd");
        }
        if (estado == null){
            throw new InvalidStatusException("estado");
        }
        if (fechaCreacion.isAfter(fechaLimite) || fechaLimite.isBefore(fechaCreacion)){
            throw new IllegalDateException("sd");
        }


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

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaLimite() {
        return fechaLimite;
    }

    public Estados getEstado() {
        return estado;
    }
}
