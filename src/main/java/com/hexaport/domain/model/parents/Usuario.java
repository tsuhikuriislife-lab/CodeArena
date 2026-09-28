package com.hexaport.domain.model.parents;

import com.hexaport.domain.exception.InvalidNumericValueException;
import com.hexaport.domain.exception.InvalidStatusException;
import com.hexaport.domain.model.enums.Estados;
import com.hexaport.domain.model.enums.Level;
import com.hexaport.domain.model.enums.Rol;

public abstract class Usuario{
    private Long id;
    private String nombre;
    private String username;
    private Rol rol;
    private double edad;
    private String correoElectronico;
    private String contrasena;
    private Level nivel;
    private double xpAcc;
    private Estados estado;

    public Usuario(Long id, Estados estado, String nombre, String username, Rol rol, double edad, String correoElectronico, String contrasena, Level nivel, double xpAcc) {
        this.id = id;
        this.estado = estado;
        this.nombre = nombre;
        this.username = username;
        this.rol = rol;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.nivel = nivel;
        this.xpAcc = xpAcc;
    }

    public void addXP(double xp){
        if (xp < 0){
            throw new InvalidNumericValueException("xp");
        }

        this.xpAcc += xp;
        this.nivel = Level.fromXp(xpAcc);
    }

    public void activate(){
        if (this.estado == Estados.ACTIVE){
            throw new InvalidStatusException("status");
        }
        this.estado = Estados.ACTIVE;
    }

    public void deactivate(){
        if (this.estado == Estados.INACTIVE){
            throw new InvalidStatusException("status");
        }
        this.estado = Estados.INACTIVE;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public Rol getRol() {
        return rol;
    }

    public double getEdad() {
        return edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Level getNivel() {
        return nivel;
    }

    public double getXpAcc() {
        return xpAcc;
    }

    public Estados getEstado() {
        return estado;
    }
}
