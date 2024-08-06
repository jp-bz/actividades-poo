
package ejercicio21capitulo3;

public class Triangulo {
    double lado_a;
    double lado_b;
    double lado_c;
    
    public Triangulo(double lado_a, double lado_b, double lado_c) {
        this.lado_a = lado_a;
        this.lado_b = lado_b;
        this.lado_c = lado_c;
        }
    
        double perimetro() {
        return lado_a + lado_b + lado_c;
        }
        
        double semiperimetro() {
            return perimetro() / 2;
        }
        
        double area() {
            return Math.sqrt(semiperimetro() * (semiperimetro() - lado_a) * (semiperimetro() - lado_b) * (semiperimetro() - lado_c));
        }
}
        
            

        