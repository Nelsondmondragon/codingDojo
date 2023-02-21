public class Calculadora {

    private double operadorUno;
    private double operadorDos;
    private String operacion;


    public double realizarOperacion() {
        return this.operacion.equals("+") ?
                this.operadorUno + this.operadorDos : this.operadorUno - this.operadorDos;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getOperadorUno() {
        return operadorUno;
    }

    public void setOperadorUno(double operadorUno) {
        this.operadorUno = operadorUno;
    }

    public double getOperadorDos() {
        return operadorDos;
    }

    public void setOperadorDos(double operadorDos) {
        this.operadorDos = operadorDos;
    }
}
