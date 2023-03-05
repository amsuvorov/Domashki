package dz_8.animal.home.Animals;

import dz_8.animal.HomeAnimals;

public class Cat extends HomeAnimals {
    @Override
    public boolean move() {
        System.out.println("Move");

        return false;
    }
}
