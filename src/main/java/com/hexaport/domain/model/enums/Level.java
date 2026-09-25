package com.hexaport.domain.model.enums;

public enum Level {
    ROOKIE(0),
    JUNIOR(500),
    DEVELOPER(1500),
    SENIOR(3000),
    MASTER(5000),
    LEGEND(10000);

    private final double minXp;

    Level(double minXp){
        this.minXp = minXp;
    }

    public double getMinXp() {
        return minXp;
    }

    public static Level fromXp(double xp){
        Level currentLevel = ROOKIE;
        for (Level level : Level.values()){
            if (xp >= level.minXp){
                currentLevel = level;
            } else {
                break;
            }
        }
        return currentLevel;
    }
}
