package dz_8.machine.flyMachine;

import dz_8.machine.FlyMachine;

public class Airplane extends FlyMachine {
    @Override
    public boolean fly() {
        System.out.println("Fly");

        return false;
    }
}
