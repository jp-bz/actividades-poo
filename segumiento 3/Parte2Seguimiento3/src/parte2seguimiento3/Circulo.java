
package parte2seguimiento3;

public class Circulo {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    String calcularArea() {
        return "El area es: " + (Math.PI * Math.pow(radio, 2));
    }

    String calcularPerimetro() {
        return "El perimetro es: " + (2 * Math.PI * radio);
    }
}
