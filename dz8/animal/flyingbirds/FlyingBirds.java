package dz8.animal.flyingbirds;

import dz8.animal.Animal;

public class FlyingBirds extends Animal {
    public String nameFlyingBirds;

    public FlyingBirds(String nameFlyingBirds) {
        this.nameFlyingBirds = nameFlyingBirds;
    }

    public String getNameFlyingBirds() {
        return nameFlyingBirds;
    }

    @Override
    public boolean name() {
        {
            System.out.println("My name is " + getNameFlyingBirds());
        }
        return false;
    }
}

