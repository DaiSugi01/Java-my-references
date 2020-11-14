package exercise.java.serializations;

import java.io.Serializable;

public class DungeonGame implements Serializable {

    private static final long serialVersionUID = -4909622391570676982L;

    public int x = 3;
    transient int y = 4;
    private short z = 5;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public short getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "[X]: " + this.getX() +
                "\n[Y]: " + this.getY() +
                "\n[Z]: " + this.getZ() + "\n";
    }
}