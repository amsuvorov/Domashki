package dz8.machines.flyMachines;

import dz8.machines.Machines;

public class FlyMachines extends Machines {
    public String nameFlyMachines;

    public FlyMachines(String nameFlyMachines) {
        this.nameFlyMachines = nameFlyMachines;
    }

    public String getNameFlyMachines() {
        return nameFlyMachines;
    }

    @Override
    public boolean name() {
        {
            System.out.println("My name is " + getNameFlyMachines());
        }
        return false;
    }
}

