public class Ejercicios {

    public static void main(String[] args) {

        /**
         * 
         * 1. Básico: imprime todos los números enteros del 0 al 150.
         * 2. Múltiplos de cinco: imprime todos los múltiplos de 5 entre 5 y 1,000.
         * 3. Contar, a la manera del Dojo: imprime números enteros del 1 al 100. Si es
         * divisible por 5, imprime "Coding” en su lugar. Si es divisible por 10,
         * imprime "Coding Dojo".
         * 4. Whoa. Es un gran idiota: agrega los enteros impares del 0 al 500,000, e
         * imprime la suma final.
         * 5. Cuenta regresiva de a 4: imprime números positivos comenzando desde el
         * 2018, en cuenta regresiva de 4 en 4.
         */

        basic();
        System.out.println();
        multipliFive();
        System.out.println();
        count();
        System.out.println();
        sum();
        System.out.println();
        regresivo();

    }

    static void basic() {
        for (int i = 0; i <= 150; i++) {
            System.out.println(i);
        }
    }

    static void multipliFive() {
        for (int i = 5; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }

        }
    }

    static void count() {
        for (int i = 5; i < 100; i += 5) {
            boolean valid = (i % 5 == 0) && (i % 10 != 0);
            // System.out.println(valid + " " + i);
            if (valid) {
                System.out.println("Coding");
            } else {
                System.out.println("Coding Dojo");
            }
        }

    }

    static void sum() {
        long sum = 0;
        for (int i = 0; i <= 500000; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static void regresivo() {
        int anno = 2018;
        while (anno > 0) {
            System.out.println(anno);
            anno -= 4;
        }
    }
}
