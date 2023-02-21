public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setOperadorUno(10.5);
        calculadora.setOperadorDos(5.2);
        calculadora.setOperacion("+");
        System.out.println(calculadora.realizarOperacion());
    }
}