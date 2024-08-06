
package ejercicio11capitulo4;

import java.util.Scanner;

public class Ejercicio11Capitulo4 {

    public static void main(String[] args) {
        int n_1;
        int n_2;
        int n_3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese numero 1: ");
        n_1 = entrada.nextInt();
        System.out.println("Ingrese numero 2 (diferente de 1): ");
        n_2 = entrada.nextInt();
        System.out.println("Ingrese numero 3 (diferente de 1 y 2): ");
        n_3 = entrada.nextInt();
        
        if ((n_1 > n_2) && (n_1 > n_3) && (n_2 != n_3)) {
            System.out.println("El mayor valor entre " + n_1 + ", " + n_2 + " y " + n_3 + " es " + n_1);
        }   else if ((n_2 > n_1) && (n_2 > n_3) && (n_1 != n_3)) {
            System.out.println("El mayor valor entre " + n_1 + ", " + n_2 + " y " + n_3 + " es " + n_2);
        }   else if ((n_3 > n_1) && (n_3 > n_2) && (n_1 != n_2)) {
            System.out.println("El mayor valor entre " + n_1 + ", " + n_2 + " y " + n_3 + " es " + n_3);
        }   else {
            System.out.println("No se puede determinar un numero mayor porque hay dos o mas numeros iguales");
        }
        }    
    }
    

