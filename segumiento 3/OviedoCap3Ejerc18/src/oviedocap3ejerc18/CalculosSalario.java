
package oviedocap3ejerc18;

public class CalculosSalario {
    double valor_hora_trabajo, horas_trabajo_mes, retencion_fuente;
    
    public CalculosSalario(double horas_trabajo_mes, double valor_hora_trabajo, double retencion_fuente) {
        this.horas_trabajo_mes = horas_trabajo_mes;
        this.valor_hora_trabajo = valor_hora_trabajo;
        this.retencion_fuente = retencion_fuente;
    }
    
    double salarioBruto() {
        return (horas_trabajo_mes * valor_hora_trabajo);
    }
    
    double salarioNeto() {
        double salario_bruto = salarioBruto();
        return salario_bruto - (salario_bruto * (retencion_fuente / 100));
    }
}

