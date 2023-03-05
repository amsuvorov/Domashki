package dz8.animal.birds;

import dz8.animal.Animal;

public class Birds extends Animal {
    public String nameBirds;

    public Birds(String nameBirds) {
        this.nameBirds = nameBirds;
    }

    public String getNameBirds() {
        return nameBirds;
    }

    @Override
    public boolean name() {
        {
            System.out.println("My name is " + getNameBirds());
        }
        return false;
    }
}

