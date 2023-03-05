package dz8.animal;

import dz8.Objects;

public abstract class Animal extends Objects {
    public String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

   public abstract boolean name();
    }

