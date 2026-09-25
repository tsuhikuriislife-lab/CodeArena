package com.hexaport.domain.model;

import com.hexaport.domain.model.enums.Category;
import com.hexaport.domain.model.enums.Difficulty;
import com.hexaport.domain.model.enums.Estados;
import com.hexaport.domain.model.parents.Challenge;

import java.util.Date;

public class CommonChallenge extends Challenge {
    public CommonChallenge(long id, String titulo, String descripcion, Category categoria, Difficulty dificultad, double xpPrize, Date fechaCreacion, Date fechaLimite, Estados estado) {
        super(id, titulo, descripcion, categoria, dificultad, xpPrize, fechaCreacion, fechaLimite, estado);
    }
}
