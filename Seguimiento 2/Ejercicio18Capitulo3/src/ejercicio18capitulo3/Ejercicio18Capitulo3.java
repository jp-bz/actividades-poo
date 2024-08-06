
package ejercicio18capitulo3;

import java.util.Scanner;

public class Ejercicio18Capitulo3 {

    public static void main(String[] args) {
       int codigo;
       String nombre;
       double numero_horas_trabajadas_mes;
       double valor_hora;
       double porcentaje_retencion;
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Ingrese el codigo del empleado: ");
       codigo = entrada.nextInt();
       
       System.out.println("Ingrese el nombre del empleado: ");
       entrada.nextLine();
       nombre = entrada.nextLine();
       
       System.out.println("Ingrese el numero de horas trabajdas al mes por el empleado: ");
       numero_horas_trabajadas_mes = entrada.nextDouble();
       
       System.out.println("Ingrese el valor de la hora trabajda al mes por el empleado: ");
       valor_hora = entrada.nextDouble();
       
       System.out.println("Ingrese la retencion (numero entero): ");
       porcentaje_retencion = entrada.nextDouble();
       
       Salario calculo_1 = new Salario(numero_horas_trabajadas_mes, valor_hora, porcentaje_retencion);
       
       System.out.println("Codigo: " + codigo);
       System.out.println("Nombre: " + nombre);
       System.out.println("Salario bruto: " + calculo_1.calcularSalarioBruto());
       System.out.println("Salario neto: " + calculo_1.calcularSalarioNeto());
       
       
       
    }
    
}
