import java.util.ArrayList;

public class EjerciciosHoy {

    public static void main(String[] args) {

        System.out.println(factorial(4));

        System.out.println(fibonacci(10));
    }

    static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    static ArrayList<Integer> fibo = new ArrayList<>();

    static ArrayList<Integer> fibonacci(int num) {

        fibo.add(0);
        fibo.add(1);
        for (int i = 2; i < num; i++) {
            fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
        }

        return fibo;
    }
}
