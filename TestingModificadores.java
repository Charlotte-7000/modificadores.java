import paquete1.Clase2;

public class TestingModificadores {

    public static void main(String[] args) {
        Padre papa = new Padre();
        Hijo chamaco = new Hijo();
        Hijo chamaca = new Hijo();
        Clase2 objeto2 = new Clase2();

        // Asignar valores a miembros de la clase padre
        // Asignar valores es un método de acceso a los miembros

        papa.setVariable2(15);
        papa.variable1 = 12; // variable1 es pública

        // Leer valores de los miembros de la clase padre
        // Leer valores es otro método de acceso a los miembros

        System.out.println("Valor de variable2: " + papa.getVariable2());
        System.out.println("Valor de variable1: " + papa.variable1);

        // Usando objetos de la clase Hijo
        chamaco.setVariable3(16);
        chamaco.setVarsPadre();
        System.out.println("Info del chamaco: " + chamaco.toString());

        chamaca.setVariable3(98);
        chamaca.variable1 = 32;
        chamaca.setVariable2(29);
        System.out.println("Info de la chamaca: " + chamaca.toString());

        System.out.println();

        // Uso correcto de setters (x ahora es privado en Clase1)
        objeto2.setX(500);

        // Esto no se puede hacer porque 'y' es protected y TestingModificadores está fuera del paquete1
        // objeto2.y = 100;

        objeto2.setZ(86);
        System.out.println(objeto2.getData());
    }
}