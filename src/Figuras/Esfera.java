package Figuras;
public class Esfera extends FiguraGeometrica {
    private double radio; // Atributo que identifica el radio de una esfera
    /**
     * Constructor de la clase Esfera
     * @param radio Parámetro se define el radio de una esfera
     */
    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calcularVolumen()); /* Calcula el volumen y establece su atributo */
        this.setSuperficie(calcularSuperficie()); /* Calcula la superficie y establece su atributo */
    }
    /**
     * Método para calcular el volumen de una esfera
     * @return El volumen de una esfera
     */
    public double calcularVolumen() {
        return 1.333 * Math.PI * Math.pow(this.radio, 3.0);
    }
    /**
     * Método para calcular la superficie de una esfera
     * @return La superficie de una esfera
     */
    public double calcularSuperficie() {
        return 4.0 * Math.PI * Math.pow(this.radio, 2.0);
    }
}

