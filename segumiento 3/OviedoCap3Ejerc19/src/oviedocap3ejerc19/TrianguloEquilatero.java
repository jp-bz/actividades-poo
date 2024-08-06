
package oviedocap3ejerc19;

public class TrianguloEquilatero {
    double valor_lado;
    
    public TrianguloEquilatero (double valor_lado){
        this.valor_lado = valor_lado;
    }
    
    double perimetro() {
        return (3 * valor_lado);
    }
    
    double altura() {
        return (Math.sqrt(3) / 2) * valor_lado;
    }
    
    double area () {
        return (Math.sqrt(3) / 4) * Math.pow(valor_lado, 2);
    }
}
