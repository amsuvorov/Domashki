import dz8.Objects;
import dz8.animal.Animal;
import dz8.animal.birds.Birds;
import dz8.animal.fish.Fish;
import dz8.animal.flyingbirds.FlyingBirds;
import dz8.animal.homeAnimal.HomeAnimal;
import dz8.machines.flyMachines.FlyMachines;
import dz8.machines.roadMachines.RoadMachines;
import dz8.machines.waterMachines.WaterMachines;


public class Main {
    public static void main(String[] args) {
        Objects[] objects1 = new Objects[]{new HomeAnimal("Dog"),
                new HomeAnimal("Cat"), new HomeAnimal("Hamster"),
                new Fish("Pike"), new Fish("Carp"), new Fish("Catfish"),
                new Birds("Penguin"), new Birds("Kiwi"), new Birds("Ostrich"),
                new Birds("Pitching"), new FlyingBirds("Eagle"), new FlyingBirds("Leleka"),
                new FlyingBirds("Dove"), new FlyMachines("Airplane"),
                new FlyMachines("Rotorcraft"), new FlyMachines("Balloon"),
                new RoadMachines("Car"), new RoadMachines("Bus"),
                new RoadMachines("Tactor"),
                new WaterMachines("Boat"), new WaterMachines("Lodka"),
                new WaterMachines("Barge")};
        for (Objects objects : objects1) {
            objects.name();
        }
    }
}