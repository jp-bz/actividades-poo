
package ejercicio12capitulo4;

import java.util.Scanner;

public class Ejercicio12Capitulo4 {

    public static void main(String[] args) {
        String nombre;
        double n_horas_trabajadas;
        double valor_hora;
        double horas_extra_trabajadas;
        double horas_extra_mayores_8;
        double salario;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        n_horas_trabajadas = entrada.nextDouble();
        System.out.println("Ingrese el valor por hora");
        valor_hora = entrada.nextDouble();
        
        if (n_horas_trabajadas > 40){
            horas_extra_trabajadas = n_horas_trabajadas - 40;
            if (horas_extra_trabajadas > 8){
                horas_extra_mayores_8 = horas_extra_trabajadas - 8;
                salario = (valor_hora * 40) + (2 * valor_hora * 8) + (3 * valor_hora * horas_extra_mayores_8);
            }   else {
                salario = (valor_hora * 40) + (2 * valor_hora * horas_extra_trabajadas);
            }
        }   else {
            salario = valor_hora * n_horas_trabajadas;
        }
        
        System.out.println("El trabajador " + nombre + " devengo: $" + salario);
    }
}
    

