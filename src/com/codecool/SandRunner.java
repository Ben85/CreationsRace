package com.codecool;

public class SandRunner extends Creature{


    public SandRunner(int levelOfWater, String name) {
        super(levelOfWater, 8, name);
    }

    @Override
    public void doSimulation(Weather weather) {
        if (weather.equals(Weather.SUNNY)){
            levelOfWater -= 1;
            distance += 3;
        } else if (weather.equals(Weather.CLOUDY)){
            distance += 1;
        } else {
            levelOfWater += 3;
        }
    }
}
