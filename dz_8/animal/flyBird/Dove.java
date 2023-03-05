package dz_8.animal.flyBird;

import dz_8.animal.FlyBirds;

public class Dove extends FlyBirds {
    @Override
    public boolean fly() {
        System.out.println("Fly");

        return false;
    }
}
