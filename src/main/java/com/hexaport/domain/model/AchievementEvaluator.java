package com.hexaport.domain.model;



public interface AchievementEvaluator {
    String getAchievementCode();
    boolean isEligible(UserImplement user, ParticipationImplement participation, long totalCompleted);
}
