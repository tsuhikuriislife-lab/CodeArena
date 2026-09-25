package com.hexaport.application.port.out;

import com.hexaport.domain.model.CommonChallenge;
import com.hexaport.domain.model.enums.Difficulty;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ChallengeRepositoryPort {
    CommonChallenge save(CommonChallenge challenge);
    Optional<CommonChallenge> findById(long id);
    List<CommonChallenge> findAllActive();
    List<CommonChallenge> findByDifficulty(Difficulty difficulty);
    List<CommonChallenge> findByCategory(long id);
    List<CommonChallenge> findExpirationBefore(LocalDateTime dateTime);
}
