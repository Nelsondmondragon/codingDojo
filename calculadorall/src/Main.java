public class Main {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        c.realizarOperacion("10.5");

        c.realizarOperacion("+");

        c.realizarOperacion("5.2");

        c.realizarOperacion("*");
        c.realizarOperacion("10");
//        c.realizarOperacion("/");
//        c.realizarOperacion("2");
        c.realizarOperacion("=");

        System.out.println(c.getResultados());
    }
}