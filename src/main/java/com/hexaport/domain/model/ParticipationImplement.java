package com.hexaport.domain.model;

import com.hexaport.domain.model.enums.SubmitState;
import com.hexaport.domain.model.parents.Challenge;
import com.hexaport.domain.model.parents.Participation;
import com.hexaport.domain.model.parents.Usuario;

import java.util.Date;

public class ParticipationImplement extends Participation {
    public ParticipationImplement(long id, Usuario usuario, Challenge reto, Date fechaInicio, Date fechaEntrega, SubmitState estado, String submittedSolution, double xpEarned) {
        super(id, usuario, reto, fechaInicio, fechaEntrega, estado, submittedSolution, xpEarned);
    }
}
