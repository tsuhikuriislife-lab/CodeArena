package com.hexaport.domain.model.achievements;

import com.hexaport.domain.model.AchievementEvaluator;
import com.hexaport.domain.model.ParticipationImplement;
import com.hexaport.domain.model.UserImplement;

public class TenChallengesEvaluator implements AchievementEvaluator {
    private static final String ACHIEVEMENT_CODE = "CHALLENGE_MASTER_10";

    @Override
    public String getAchievementCode() {
        return ACHIEVEMENT_CODE;
    }

    @Override
    public boolean isEligible(UserImplement user, ParticipationImplement lastParticipation, long totalCompleted) {
        // Se desbloquea al llegar a 10 retos o más
        return totalCompleted >= 10;
    }
}
