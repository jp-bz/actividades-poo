
package ejercicio22capitulo4;

import java.util.Scanner;

public class Ejercicio22Capitulo4 {

    public static void main(String[] args) {
        String nombre;
        double valor_hora;
        double horas_trabajo_mes;
        double salario_mensual;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el valor por hora de trabajo: ");
        valor_hora = entrada.nextDouble();
        System.out.println("Ingrese las horas de trabajo al mes: ");
        horas_trabajo_mes = entrada.nextDouble();
        
        salario_mensual = valor_hora * horas_trabajo_mes;
        
        if (salario_mensual > 450000) {
            System.out.println("El nombre del empleado es " + nombre + ". Y su salario es de $" + salario_mensual);
        }   else if (0 <= salario_mensual && salario_mensual <= 450000) {
            System.out.println("El nombre del empleado es " + nombre);
        }   else {
            System.out.println("Los valores ingresados no son validos");
        }
    }
    
}
