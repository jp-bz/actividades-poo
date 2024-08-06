
package ejercicio24capitulo4;

import java.util.Scanner;

public class Ejercicio24Capitulo4 {

    public static void main(String[] args) {
        double A;
        double B;
        double C;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera A: ");
        A = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        B = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        C = entrada.nextDouble();
        
        if ((A > B) && (A > C)) {
            System.out.println("La esfera de mayor peso es A, con un peso de: " + A);
        }   else if ((B > A) && (B > C)) {
            System.out.println("La esfera de mayor peso es B, con un peso de: " + B);
        }   else if ((C > A) && (C > B)) {
            System.out.println("La esfera de mayor peso es C, con un peso de: " + C);
        }   else if ((A == B) && (A > C)) {
            System.out.println("Las esferas A y B son las que tienen mayor peso, ambas con un peso de: " + A);  
        }    else if ((A == C) && (A > B)) {
            System.out.println("Las esferas A y C son las que tienen mayor peso, ambas con un peso de: " + A);
        }   else if ((B == C) && (B > A)) {
            System.out.println("Las esferas B y C son las que tienen mayor peso, ambas con un peso de: " + B);
        }   else {
            System.out.println("Las esferas A, B y C tienen el mismo peso, de manera que no se puede determinar una mas pesada que las otras");
        }
    }
}
