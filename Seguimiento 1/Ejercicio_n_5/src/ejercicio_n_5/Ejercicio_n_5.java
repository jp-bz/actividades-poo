/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_n_5;

public class Ejercicio_n_5 {

    public static void main(String[] args) {
        double suma, x, y;
        suma = 0;
        x = 20;
        suma = suma + x;
        y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + (x / y);
        System.out.println("El valor de la suma es: " + suma);
    }
    
}
