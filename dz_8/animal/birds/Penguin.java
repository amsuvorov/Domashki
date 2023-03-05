package dz_8.animal.birds;

import dz_8.animal.Birds;

public class Penguin extends Birds {
    @Override
    public boolean move() {
        System.out.println("Move");

        return false;
    }
}
