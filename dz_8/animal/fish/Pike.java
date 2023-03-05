package dz_8.animal.fish;

import dz_8.animal.Fish;

public class Pike extends Fish {
    @Override
    public boolean swim() {
        System.out.println("Swim");

        return false;
    }
}
