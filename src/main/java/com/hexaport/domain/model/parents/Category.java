package com.hexaport.domain.model.parents;

import com.hexaport.domain.exception.InvalidNumericValueException;
import com.hexaport.domain.exception.InvalidStatusException;
import com.hexaport.domain.exception.InvalidValueException;
import com.hexaport.domain.model.enums.Difficulty;
import com.hexaport.domain.model.enums.Estados;
import com.hexaport.domain.utils.EnumUtils;

public abstract class Category {
    private final double id;
    private String nombre;
    private String descripcion;
    private Estados estado;

    public Category(double id, String nombre, String descripcion, Estados estado) {
        if (nombre == null|| nombre.isBlank()){
            throw new InvalidValueException("nombre");
        }
        if (id <= 0){
            throw new InvalidNumericValueException("id");
        }
        if (descripcion == null || descripcion.isBlank()){
            throw new InvalidValueException("descripcion");
        }
        if (estado == null) {
            throw new InvalidStatusException("estado");
        }
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }
}
