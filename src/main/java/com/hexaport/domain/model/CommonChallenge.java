package com.hexaport.domain.model;

import com.hexaport.domain.model.enums.Difficulty;
import com.hexaport.domain.model.enums.Estados;
import com.hexaport.domain.model.parents.Challenge;

import java.time.LocalDateTime;

public class CommonChallenge extends Challenge {
    public CommonChallenge(long id, String titulo, String descripcion, CategoriaImplement categoria, Difficulty dificultad, double xpPrize, LocalDateTime fechaCreacion, LocalDateTime fechaLimite, Estados estado) {
        super(id, titulo, descripcion, categoria, dificultad, xpPrize, fechaCreacion, fechaLimite, estado);
    }
}
