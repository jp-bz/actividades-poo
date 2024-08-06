
package ejercicio13capitulo4;

import java.util.Scanner;

public class Ejercicio13Capitulo4 {

    public static void main(String[] args) {
        double valor_compra;
        String color_bolita;
        double valor_a_pagar;
        double porcentaje_descuento;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese valor de la compra: ");
        valor_compra = entrada.nextDouble();
        System.out.println("Ingrese el color de la bolita: ");
        color_bolita = entrada.next();
        
        if (color_bolita.equals("blanco")) {
            porcentaje_descuento = 0;
        }   else if (color_bolita.equals("verde")) {
            porcentaje_descuento = 0.1;  
        }   else if (color_bolita.equals("amarillo")) {
            porcentaje_descuento = 0.25;   
        }   else if (color_bolita.equals("azul")) {
            porcentaje_descuento = 0.5;   
        }   else {
            porcentaje_descuento = 1;
        }
        
        valor_a_pagar = valor_compra - (valor_compra * porcentaje_descuento);
        System.out.println("El cliente debe pagar: $" + valor_a_pagar);
}
}
