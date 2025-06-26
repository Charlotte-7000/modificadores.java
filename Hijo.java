import paquete1.Clase1;

public class Hijo extends Padre {

    private int variable3;

    public Hijo() {
        super();
    }

    public int getVariable3() {
        return variable3;
    }

    public void setVariable3(int variable3) {
        this.variable3 = variable3;
    }

    // Modificar las variables heredadas de la clase padre
    public void setVarsPadre() {
        super.variable1 = 500;        // variable1 es pública, así que es accesible
        this.variable1 = 250;         // También accesible directamente
        super.setVariable2(-12);      // Correctamente usando el setter
    }

    // Método para modificar datos de un objeto Clase1
    public void setDataClase1() {
        Clase1 objeto1 = new Clase1();
        objeto1.setX(15);
        objeto1.setY(22);
        objeto1.setZ(87);
        objeto1.setW(38);
    }

    @Override
    public String toString() {
        return super.toString() + " Hijo [variable3=" + variable3 + ", variable1=" + this.variable1 + "]";
    }
}
