
package parte2seguimiento3;

public class Cuadrado {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    String calcularArea() {
        return "El area es: " + (lado * lado);
    }

    String calcularPerimetro() {
        return "El perimetro es: " + (4 * lado);
    }
}
