
package ejercicio14capitulo4;

import java.util.Scanner;

public class Ejercicio14Capitulo4 {

    public static void main(String[] args) {
        double ventas_dpto_1;
        double ventas_dpto_2;
        double ventas_dpto_3;
        double salario;
        double total_ventas_empresa;
        double porc_ventas_totales;
        double salario_dpto_1;
        double salario_dpto_2;
        double salario_dpto_3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese las ventas del departamento 1: ");
        ventas_dpto_1 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2: ");
        ventas_dpto_2 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3: ");
        ventas_dpto_3 = entrada.nextDouble();
        System.out.println("Ingrese el salario de los vendedores de los 3 departamentos: ");
        salario = entrada.nextDouble();
        
        total_ventas_empresa = ventas_dpto_1 + ventas_dpto_2 + ventas_dpto_3;
        porc_ventas_totales = total_ventas_empresa * 0.33;
        
        if (ventas_dpto_1 > porc_ventas_totales) {
            salario_dpto_1 = salario + (0.2 * salario);
        }   else {
            salario_dpto_1 = salario;
        }
        
        if (ventas_dpto_2 > porc_ventas_totales) {
            salario_dpto_2 = salario + (0.2 * salario);
        }   else {
            salario_dpto_2 = salario;
        }
        
        if (ventas_dpto_3 > porc_ventas_totales) {
            salario_dpto_3 = salario + (0.2 * salario);
        }   else {
            salario_dpto_3 = salario;
        }
        
        System.out.println("Salario vendedores dpto 1: $" + salario_dpto_1);
        System.out.println("Salario vendedores dpto 2: $" + salario_dpto_2);
        System.out.println("Salario vendedores dpto 3: $" + salario_dpto_3);
    }
    
}
