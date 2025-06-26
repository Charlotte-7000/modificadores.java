package paquete1;

public class Clase1 {
    private int x;
    protected int y;
    private int z;
    private int w;

    // Getter y Setter para x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter y Setter para y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Getter y Setter para z
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    // Getter y Setter para w
    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Clase1 [x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + "]";
    }
}
