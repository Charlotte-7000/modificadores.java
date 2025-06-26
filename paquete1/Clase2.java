package paquete1;

public class Clase2 extends Clase1 {

    // Clase2 hereda de Clase1, y ambas están en el mismo paquete.
    // Por eso Clase2 puede usar los datos protegidos como y.

    public void setData() {
        setX(12);       // Usando el setter en lugar de acceso directo
        this.y = 9;     // y es protected, se puede acceder directamente
        setZ(18);       // z es private, debe usarse el setter
        setW(24);       // Si w también fue hecho private
    }

    public String getData() {
        return "Datos de Clase2: x=" + getX() + " y=" + this.y + " z=" + getZ() + " w=" + getW();
    }
}
