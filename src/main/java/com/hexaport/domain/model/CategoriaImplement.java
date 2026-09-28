package com.hexaport.domain.model;

import com.hexaport.domain.model.enums.Estados;
import com.hexaport.domain.model.parents.Category;

public class CategoriaImplement extends Category {
    public CategoriaImplement(double id, String nombre, String descripcion, Estados estado) {
        super(id, nombre, descripcion, estado);
    }
}
