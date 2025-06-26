public class Padre {
    // Elementos de la clase padre
    public int variable1; // Solo debe aceptar valores positivos
    private int variable2; // Solo debe aceptar valores negativos

    // Getter para variable2
    public int getVariable2() {
        return variable2;
    }

    // Setter para variable2: solo acepta valores negativos
    public void setVariable2(int variable2) {
        if (variable2 < 0) {
            this.variable2 = variable2;
        } else {
            this.variable2 = 0; // O puedes dejarlo igual sin modificarlo
        }
    }

    @Override
    public String toString() {
        return "Padre [variable1=" + variable1 + ", variable2=" + variable2 + "]";
    }
}
