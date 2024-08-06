
package oviedocap4ejerc10;

public class Matricula {
    String numeroInscripcion;
    String nombre;
    double patrimonio;
    double pagoMatricula;
    int estrato;

    public Matricula(String numeroInscripcion, String nombre, double patrimonio, int estrato) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
        this.pagoMatricula = 50000;
        this.estrato = estrato;
        calcularPagoMatricula();
    }

    private void calcularPagoMatricula() {
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += patrimonio * 0.03;
        }
    }

    public String NumeroInscripcion() {
        return numeroInscripcion;
    }

    public String Nombre() {
        return nombre;
    }

    public double Patrimonio() {
        return patrimonio;
    }

    public double PagoMatricula() {
        return pagoMatricula;
    }

    public int Estrato() {
        return estrato;
    }

    public String mostrarDatos() {
        if ((patrimonio >= 0 && estrato >= 0) && (patrimonio <= 2000000 || estrato <= 3 || (patrimonio > 2000000 && estrato > 3))) {
            return "El estudiante con numero de inscripcion " + numeroInscripcion + " y nombre " +
                    nombre + " debe pagar " + pagoMatricula;
        } else {
            return "Los valores de patrimonio o de estrato son incorrectos";
        }
    }
}
