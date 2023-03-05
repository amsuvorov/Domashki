package dz8.animal.fish;

import dz8.animal.Animal;

public class Fish extends Animal {
    public String nameFish;

    public Fish(String nameFish) {
        this.nameFish = nameFish;
    }

    public String getNameFish() {
        return nameFish;
    }

    @Override
    public boolean name() {
        {
            System.out.println("My name is " + getNameFish());
        }
        return false;
    }
}

