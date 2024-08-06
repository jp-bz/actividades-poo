
package parte2seguimiento3;

public class TrianguloRectangulo {
    double base;
    double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura) / 2.0;
    }

    double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    double calcularHipotenusa() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && base == hipotenusa) {
            return "Equilátero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
