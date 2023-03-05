package dz_8.machine.waterMachine;

import dz_8.machine.WaterMachine;

public class Boat extends WaterMachine {
    @Override
    public boolean swim() {
        System.out.println("Swim");

        return false;
    }
}
