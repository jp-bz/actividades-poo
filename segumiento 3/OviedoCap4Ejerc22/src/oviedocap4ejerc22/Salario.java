
package oviedocap4ejerc22;

import java.text.NumberFormat;
import java.util.Locale;

public class Salario {
    private String nombre;
    private double valorHora;
    private double horasTrabajoMes;
    private double salarioMensual;

    public Salario(String nombre, double valorHora, double horasTrabajoMes) {
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.horasTrabajoMes = horasTrabajoMes;
        this.salarioMensual = calcularSalarioMensual();
    }

    private double calcularSalarioMensual() {
        return valorHora * horasTrabajoMes;
    }

    public String mostrarDatos() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        if (salarioMensual > 450000) {
            return "El nombre del empleado es " + nombre + ". Y su salario es de $" + salarioMensual;
        } else if (salarioMensual >= 0 && salarioMensual <= 450000) {
            return "El nombre del empleado es " + nombre;
        } else {
            return "Los valores ingresados no son válidos";
        }
    }
}

