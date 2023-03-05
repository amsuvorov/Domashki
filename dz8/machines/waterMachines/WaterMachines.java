package dz8.machines.waterMachines;

import dz8.machines.Machines;

public class WaterMachines extends Machines {
    public String nameWaterMachines;

    public WaterMachines(String nameWaterMachines) {
        this.nameWaterMachines = nameWaterMachines;
    }

    public String getNameWaterMachines() {
        return nameWaterMachines;
    }

    @Override
    public boolean name() {
        {
            System.out.println("My name is " + getNameWaterMachines());
        }
        return false;
    }
}
