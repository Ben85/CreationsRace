package com.codecool;

import java.util.*;


public class Race {

    private List<Creature> creatureList;
    private List<Weather> raceDays;

    public void generateRandomRace(int numParticipants, int numDays) {
        // TEMP
        List<Creature> creatures = new LinkedList<>();
        Creature c1 = new SandRunner(2, "c1");
        Creature c2 = new SandRunner(5, "c2");
        Creature c3 = new SandRunner(4, "c3");
        creatures.add(c1);
        creatures.add(c2);
        creatures.add(c3);

        List<Weather> raceDays = new LinkedList<>();
        raceDays.add(Weather.CLOUDY);
        raceDays.add(Weather.RAINY);
        initRace(creatures, raceDays);
    }

    public void initRace(List<Creature> creatureList, List<Weather> raceDays){
        this.creatureList = creatureList;
        this.raceDays = raceDays;
    }

    public void simulateRace(){
        for (int i = 0; i < raceDays.size(); i++){
            for (Creature creature: creatureList){
                creature.simulateADay(raceDays.get(i));
            }
        }

    }



}
