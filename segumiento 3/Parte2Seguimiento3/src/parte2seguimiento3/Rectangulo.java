
package parte2seguimiento3;

public class Rectangulo {
    double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    String calcularArea() {
        return "El area es: " + (base * altura);
    }

    String calcularPerimetro() {
        return "El perimetro es: " + (2 * (base + altura));
    }
}
