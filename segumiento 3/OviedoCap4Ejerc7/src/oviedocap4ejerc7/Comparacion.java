
package oviedocap4ejerc7;

public class Comparacion {
    double a, b;
    
    public Comparacion (double a, double b) {
        this.a = a;
        this.b = b;
    }
    
     public String obtenerMayor() {
        if (a > b) {
            return "A es mayor que B";
        } else if (a == b) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
        
     }
     
}


