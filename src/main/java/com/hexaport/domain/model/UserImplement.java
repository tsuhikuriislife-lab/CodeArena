package com.hexaport.domain.model;

import com.hexaport.domain.model.enums.Estados;
import com.hexaport.domain.model.enums.Level;
import com.hexaport.domain.model.enums.Rol;
import com.hexaport.domain.model.parents.Usuario;

public class UserImplement extends Usuario {
    public UserImplement(Long id, Estados estado, String nombre, String username, Rol rol, double edad, String correoElectronico, String contrasena, Level nivel, double xpAcc) {
        super(id, estado, nombre, username, rol, edad, correoElectronico, contrasena, nivel, xpAcc);
    }
}
