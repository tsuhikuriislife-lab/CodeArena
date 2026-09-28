package com.hexaport.domain.model;

import java.time.LocalDateTime;

public class UserAchievement {
    private final Long id;
    private final Long userId;
    private final Achievement achievement;
    private final LocalDateTime unlockedAt;

    public UserAchievement(Long id, Long userId, Achievement achievement, LocalDateTime unlockedAt) {
        if (userId == null) {
            throw new IllegalArgumentException("El ID del usuario es obligatorio.");
        }
        if (achievement == null) {
            throw new IllegalArgumentException("El logro es obligatorio.");
        }
        this.id = id;
        this.userId = userId;
        this.achievement = achievement;
        this.unlockedAt = unlockedAt != null ? unlockedAt : LocalDateTime.now();
    }

    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public Achievement getAchievement() { return achievement; }
    public LocalDateTime getUnlockedAt() { return unlockedAt; }
}