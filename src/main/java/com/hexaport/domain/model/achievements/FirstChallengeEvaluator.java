package com.hexaport.domain.model.achievements;

import com.hexaport.domain.model.AchievementEvaluator;
import com.hexaport.domain.model.ParticipationImplement;
import com.hexaport.domain.model.UserImplement;

public class FirstChallengeEvaluator implements AchievementEvaluator {
    private static final String ACHIEVEMENT_CODE = "FIRST_CHALLENGE";

    @Override
    public String getAchievementCode() {
        return ACHIEVEMENT_CODE;
    }

    @Override
    public boolean isEligible(UserImplement user, ParticipationImplement participation, long totalCompleted) {
        // Se desbloquea exactamente cuando el número de retos completados es 1
        return totalCompleted == 1;
    }
}
