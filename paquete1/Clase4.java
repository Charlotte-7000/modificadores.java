package paquete1;

public class Clase4 {
    public boolean x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Clase4 [x=" + x + "y" + y +  "]";
    }

}
