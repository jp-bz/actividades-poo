
package ejercicio15capitulo4;

import java.util.Scanner;

public class Ejercicio15Capitulo4 {

    public static void main(String[] args) {
        double peso_a;
        double peso_b;
        double peso_c;
        double peso_d;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera A: ");
        peso_a = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        peso_b = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        peso_c = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera D: ");
        peso_d = entrada.nextDouble();
        
        if ((peso_a == peso_b) && (peso_a == peso_c) && (peso_a != peso_d)) {
            System.out.println("La esfera D es la diferente");
                if  (peso_d > peso_a) {
                    System.out.println("La esfera D es de mayor peso");    
                }   else {
                    System.out.println("La esfera D es de menor peso");
                }
        }   else if ((peso_a == peso_b) && (peso_a == peso_d) && (peso_a != peso_c)) {
            System.out.println("La esfera C es la diferente");
                if  (peso_c > peso_a) {
                    System.out.println("La esfera C es de mayor peso");
                }   else {
                    System.out.println("La esfera C es de menor peso");
                }   
        }   else if ((peso_a == peso_c) && (peso_a == peso_d) && (peso_a != peso_b)) {
            System.out.println("La esfera B es la diferente");
                if  (peso_b > peso_a) {
                    System.out.println("La esfera B es de mayor peso");
                }   else {
                    System.out.println("La esfera B es de menor peso");
                }
        }   else if ((peso_b == peso_c) && (peso_b == peso_d) && (peso_b != peso_a)) {
            System.out.println("La esfera A es la diferente");
                if (peso_a > peso_b) {
                    System.out.println("La esfera A es de mayor peso");
                }   else {
                    System.out.println("La esfera A es de menor peso");
                }
        }   else {
            System.out.println("Las esferas tienen el mismo peso o hay al menos dos con peso diferente. Debe haber una esfera de peso diferente.");
        }
        
    }
    
}
