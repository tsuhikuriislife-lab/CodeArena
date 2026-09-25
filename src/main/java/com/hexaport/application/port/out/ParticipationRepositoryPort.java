package com.hexaport.application.port.out;


import com.hexaport.domain.model.ParticipationImplement;
import com.hexaport.domain.model.enums.SubmitState;

import java.util.List;
import java.util.Optional;

public interface ParticipationRepositoryPort {
    ParticipationImplement save(ParticipationImplement participation);
    Optional<ParticipationImplement> findById(Long id);

    // Regla de negocio: Verificar si el jugador ya tiene una participación activa en el reto
    boolean existsByUserIdAndChallengeIdAndStatusIn(Long userId, Long challengeId, List<SubmitState> statuses);

    List<ParticipationImplement> findByUserId(Long userId);
    List<ParticipationImplement> findByUserIdAndStatus(Long userId, SubmitState status);
}