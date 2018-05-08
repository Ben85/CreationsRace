package com.codecool;

public abstract class Creature {

    int levelOfWater;
    private final int maxWater;
    private String name;
    int distance;

    boolean isItAlive(){
        return levelOfWater > 0;
    }

    public Creature(int levelOfWater, int maxWater, String name) {
        this.levelOfWater = levelOfWater;
        this.maxWater = maxWater;
        this.name = name;
    }

    public final void simulateADay(Weather weather) {
        if (isItAlive()) {
            doSimulation(weather);
        }
    }

    protected abstract void doSimulation(Weather weather);
}
