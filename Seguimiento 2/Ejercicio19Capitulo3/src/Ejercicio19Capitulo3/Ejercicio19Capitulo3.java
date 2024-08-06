 
package Ejercicio19Capitulo3;

import java.util.Scanner;

public class Ejercicio19Capitulo3 {

    public static void main(String[] args) {
        double lado;
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el lado del triangulo: ");
        lado = entrada.nextDouble();
        
        Triangulo_Equilatero calculo_1 = new Triangulo_Equilatero(lado);
       
       System.out.println("Para el triangulo equilatero de lado: " + lado);
       System.out.println("El perimetro es: " + calculo_1.calcularPerimetro());
       System.out.println("La altura es: " + calculo_1.calcularAltura());
       System.out.println("El area es: " + calculo_1.calcularArea());
        
    }
    
}
