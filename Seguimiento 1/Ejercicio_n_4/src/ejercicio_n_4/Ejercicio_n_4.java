/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_n_4;

public class Ejercicio_n_4 {

    public static void main(String[] args) {
        int edadjuan, edadana, edadalberto, edadmama;
        edadjuan = 9;
        edadalberto = 2 * (edadjuan / 3);
        edadana = 4 * (edadjuan / 3);
        edadmama = edadjuan + edadalberto + edadana;
        System.out.println("Las edades son: ");
        System.out.println("Alberto: " + edadalberto);
        System.out.println("Juan: " + edadjuan);
        System.out.println("Ana: " + edadana);
        System.out.println("Mama: " + edadmama);
    }
    
}
