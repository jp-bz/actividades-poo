
package Ejercicio19Capitulo3;

public class Triangulo_Equilatero {
    double lado;
    
     public Triangulo_Equilatero(double lado) {
        this.lado = lado;
    }
    
    double calcularArea() {
        return ((Math.pow(lado, 2) * Math.sqrt(3)) / 4);
    }
    
    double calcularAltura() {
        return ((lado * Math.sqrt(3)) / 2);
    }
    
    double calcularPerimetro() {
        return (3 * lado);
    }
        
}
