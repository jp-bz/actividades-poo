
package ejercicio21capitulo3;

import java.util.Scanner;

public class Ejercicio21Capitulo3 {

    public static void main(String[] args) {
        double lado_a;
        double lado_b;
        double lado_c;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el lado a del triangulo: ");
        lado_a = entrada.nextDouble();
        System.out.println("Ingrese el lado b del triangulo: ");
        lado_b = entrada.nextDouble();
        System.out.println("Ingrese el lado c del triangulo: ");
        lado_c = entrada.nextDouble();
        
        Triangulo calculo_1 = new Triangulo(lado_a, lado_b, lado_c);
        
        if ((lado_a + lado_b > lado_c) && (lado_a + lado_c > lado_b) && (lado_b + lado_c > lado_a)) {
            System.out.println("El perimetro es: " + calculo_1.perimetro());
            System.out.println("El semiperimetro es: " + calculo_1.semiperimetro());
            System.out.println("El area es: " + calculo_1.area());
        }   else {
            System.out.println("Los valores introducidos no corresponden a un triangulo valido");
        }
    }
}
                   