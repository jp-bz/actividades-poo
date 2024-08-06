
package ejercicio10capitulo4;

import java.util.Scanner;

public class Ejercicio10Capitulo4 {

    public static void main(String[] args) {
        String numero_inscripcion;
        String nombre;
        double patrimonio;
        double pago_matricula = 50000;
        int estrato;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese numero de inscripcion: ");
        numero_inscripcion = entrada.next();
        System.out.println("Ingrese el nombre del estudiante: ");
        entrada.nextLine();
        nombre = entrada.nextLine();
        System.out.println("Ingrese el patrimonio del estudiante: ");
        patrimonio = entrada.nextDouble();
        System.out.println("Ingrese el estrato del estudiante: ");
        estrato = entrada.nextInt();
        
        if ((patrimonio > 2000000) && (estrato > 3)) {
            pago_matricula = pago_matricula + (patrimonio * 0.03);
            System.out.println("El estudiante con numero de inscripcion " + numero_inscripcion + " y nombre " + nombre + " debe pagar " + pago_matricula);
        }   else if ((0 <= patrimonio && patrimonio <= 2000000) && (0 <= estrato && estrato <= 3)) {
            System.out.println("El estudiante con numero de inscripcion " + numero_inscripcion + " y nombre " + nombre + " debe pagar " + pago_matricula);  
        }   else {
           System.out.println("Los valores de patrimonio o de estrato son incorrectos");
        }
    }
    
}
