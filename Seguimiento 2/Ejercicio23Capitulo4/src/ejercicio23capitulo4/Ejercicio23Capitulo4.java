package ejercicio23capitulo4;

import java.util.Scanner;

public class Ejercicio23Capitulo4 {

    public static void main(String[] args) {
        double parametro_a;
        double parametro_b;
        double parametro_c;
        double solucion_1;
        double solucion_2;
        double discriminante;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del parametro A: ");
        parametro_a = entrada.nextDouble();
        System.out.println("Ingrese el valor del parametro B: ");
        parametro_b = entrada.nextDouble();
        System.out.println("Ingrese el valor del parametro C: ");
        parametro_c = entrada.nextDouble();
        
        if (parametro_a != 0) {
            discriminante = Math.pow(parametro_b, 2) - (4 * parametro_a * parametro_c);
            
                if (discriminante > 0) {
                    solucion_1 = (-(parametro_b) + Math.sqrt(discriminante)) / (2 * parametro_a);
                    System.out.println("La solucion 1 de la ecuacion es: " + solucion_1);

                    solucion_2 = (-(parametro_b) - Math.sqrt(discriminante)) / (2 * parametro_a);
                    System.out.println("La solucion 2 de la ecuacion es: " + solucion_2);
                    
                }   else if (discriminante == 0) {
                    solucion_1 = -(parametro_b) / (2 * parametro_a);
                    System.out.println("La unica solucion de la ecuacion es " + solucion_1 + " con multiplicidad algebraica 2");
                    
                }   else {
                    System.out.println("La ecuacion no tiene solucion en los reales.");
                }
        }   else {
            System.out.println("La ecuacion planteada es una ecuacion lineal. No es de interes para este ejercicio");
        }
    }
}

