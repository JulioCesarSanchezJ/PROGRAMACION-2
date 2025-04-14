package main;

public class A {
    private int x;
    private int z;

    public A(int x, int z) {
        this.x = x;
        this.z = z;
    }
    public void incrementaZ() {
        z++;
    }

    public int getZ() {
        return z;
    }
    public void incrementaXZ() {
        x++;
        z++;
    }

    public int getX() {
        return x;
    }
}







