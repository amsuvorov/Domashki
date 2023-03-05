package dz8.machines.roadMachines;

import dz8.machines.Machines;

public class RoadMachines extends Machines {
    public String nameRoadMachines;

    public RoadMachines(String nameRoadMachines) {
        this.nameRoadMachines = nameRoadMachines;
    }

    public String getNameRoadMachines() {
        return nameRoadMachines;
    }

    @Override
    public boolean name() {
        {
            System.out.println("My name is " + getNameRoadMachines());
        }
        return false;
    }
}
