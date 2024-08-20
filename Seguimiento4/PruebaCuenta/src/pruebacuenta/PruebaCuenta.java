
package pruebacuenta;

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Cuenta de ahorros");
        System.out.println(" Ingrese el saldo inicial = $");
        float saldoInicialAhorros = input.nextFloat();
        
        System.out.print("Ingrese la tasa de interes = ");
        float tasaAhorros = input.nextFloat();
        
        cuentaAhorros cuenta1 = new cuentaAhorros(saldoInicialAhorros, tasaAhorros);
        
        System.out.println("Ingrese la cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        
        System.out.println("Ingrese la cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
            
    }
    
}











