package com.hexaport.domain.model.parents;

import com.hexaport.domain.model.enums.SubmitState;

import java.util.Date;

public abstract class Participation {
    private long id;
    private Usuario usuario;
    private Challenge reto;
    private Date fechaInicio;
    private Date fechaEntrega;
    private SubmitState estado;
    private String submittedSolution;
    private double xpEarned;

    public Participation(long id, Usuario usuario, Challenge reto, Date fechaInicio, Date fechaEntrega, SubmitState estado, String submittedSolution, double xpEarned) {
        this.id = id;
        this.usuario = usuario;
        this.reto = reto;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.submittedSolution = submittedSolution;
        this.xpEarned = xpEarned;
    }
}
