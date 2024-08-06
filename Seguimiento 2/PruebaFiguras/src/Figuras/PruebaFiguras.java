
package Figuras;

import java.util.Scanner;

public class PruebaFiguras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int radio, lado, base_rectangulo, altura_rectangulo, base_triangulorectangulo, altura_triangulorectangulo;
        
        System.out.println("Ingrese el valor del radio del circulo: ");
        radio = entrada.nextInt();
        Circulo figura1 = new Circulo(radio);
        
        System.out.println("Ingrese el valor de la base del rectangulo: ");
        base_rectangulo = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura del rectangulo: ");
        altura_rectangulo = entrada.nextInt();
        Rectangulo figura2 = new Rectangulo(base_rectangulo, altura_rectangulo);
        
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        lado = entrada.nextInt();
        Cuadrado figura3 = new Cuadrado(lado);
        
        System.out.println("Ingrese el valor de la base del triangulo rectangulo: ");
        base_triangulorectangulo = entrada.nextInt();
        System.out.println("Ingrese el valor de la altura del triangulo rectangulo: ");
        altura_triangulorectangulo = entrada.nextInt();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base_triangulorectangulo,altura_triangulorectangulo);
        
        
       System.out.println("El area del circulo es = " + figura1.calcularArea());
       System.out.println("El perimetro del circulo es = "  + figura1.calcularPerimetro());
       System.out.println();
       System.out.println("El area del rectangulo es = " + figura2.calcularArea());
       System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());
       System.out.println();
       System.out.println("El area del cuadrado es = " + figura3.calcularArea());
       System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
       System.out.println();
       System.out.println("El area del triangulo es = " + figura4.calcularArea());
       System.out.println("El perimetro del triangulo es = " + figura4.calcularPerimetro());
       figura4.determinarTipoTriangulo(); 
    }
    
}
