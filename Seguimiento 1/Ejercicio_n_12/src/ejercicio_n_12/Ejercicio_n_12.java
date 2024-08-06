/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_n_12;

public class Ejercicio_n_12 {

    public static void main(String[] args) {
      double horas_trabajo_semana, valor_hora, porcentaje_retencion;
      double salario_bruto, total_retencion, salario_neto;
      horas_trabajo_semana = 48;
      valor_hora = 5000;
      porcentaje_retencion = 0.125;
      salario_bruto = horas_trabajo_semana * valor_hora;
      total_retencion = salario_bruto * porcentaje_retencion;
      salario_neto = salario_bruto - total_retencion;
      System.out.println("El salario bruto es: " + salario_bruto);
      System.out.println("La retencion en la fuente es: " + total_retencion);
      System.out.println("El salario neto es: " + salario_neto);
      
      
    }
    
}
