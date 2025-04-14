
package main;

public class B {
    private int y;
    private int z;
    public B(int y, int z) {
        this.y = y;
        this.z = z;
    }
    public void incrementaZ() {
        z++;
    }
    public int getZ() {
        return z;
    }
    public void incrementaYZ() {
        y++;
        z++;
    }
    public int getY() {
        return y;
    }
}

