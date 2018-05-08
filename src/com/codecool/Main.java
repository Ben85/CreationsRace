package com.codecool;

public class Main {
    public static void main(String[] args) {
        Race r = new Race();
        r.generateRandomRace(4, 6);

        r.simulateRace();
    }
}
