package dz8.animal.homeAnimal;

import dz8.animal.Animal;

public  class HomeAnimal extends Animal {
    public String nameHomeAnimal;
    public HomeAnimal(String nameHomeAnimal){
        this.nameHomeAnimal=nameHomeAnimal;
    }
    public String getNameHomeAnimal() {
        return nameHomeAnimal;
    }
    @Override
    public boolean name() {
        {
            System.out.println("My name is " + getNameHomeAnimal());
        }
        return false;
    }
}
