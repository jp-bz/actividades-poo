
package ejercicio7capitulo4;

import java.util.Scanner;

public class Ejercicio7Capitulo4 {

    public static void main(String[] args) {
        double A;
        double B;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor A: ");
        A = entrada.nextDouble();
        System.out.println("Ingrese el valor B: ");
        B = entrada.nextDouble();
        
        if (A > B) {
            System.out.println("A es mayor que B");
        }   else if (A == B) {
            System.out.println("A es igual a B");
        }   else {
            System.out.println("A es menor que B");     
        }
          
    }
    
}
