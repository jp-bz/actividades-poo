
package oviedocap4ejerc23;

public class Ecuacion {
    private double a;
    private double b;
    private double c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String resolver() {
        if (a == 0) {
            return "La ecuación planteada es una ecuación lineal. No es de interés para este ejercicio.";
        }

        double discriminante = Math.pow(b, 2) - (4 * a * c);

        if (discriminante > 0) {
            double solucion1 = (-(b) + Math.sqrt(discriminante)) / (2 * a);
            double solucion2 = (-(b) - Math.sqrt(discriminante)) / (2 * a);
            return "Solución 1: " + solucion1 + ". solución 2: " + solucion2;
        } else if (discriminante == 0) {
            double solucionUnica = -(b) / (2 * a);
            return "La única solución de la ecuación es: " + solucionUnica;
        } else {
            return "La ecuación no tiene solución en los reales.";
        }
    }
}

