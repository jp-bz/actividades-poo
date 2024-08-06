
package ejercicio18capitulo3;

public class Salario {
    double numero_horas_trabajadas_mes;
    double valor_hora;
    double porcentaje_retencion;
    
    public Salario(double numero_horas_trabajadas_mes, double valor_hora, double porcentaje_retencion) {
        this.numero_horas_trabajadas_mes = numero_horas_trabajadas_mes;
        this.valor_hora = valor_hora;
        this.porcentaje_retencion = porcentaje_retencion;
    }
    
    
    double calcularSalarioBruto() {
        return (numero_horas_trabajadas_mes * valor_hora);
    }
    
    double calcularRetencion() {
        return (calcularSalarioBruto() * (porcentaje_retencion / 100));
    }
    
    double calcularSalarioNeto() {
        return (calcularSalarioBruto() - calcularRetencion());
    }
      
}
