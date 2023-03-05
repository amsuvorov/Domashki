package dz8.machines;

import dz8.Objects;

public abstract class Machines extends Objects {
    public String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract boolean name();
}