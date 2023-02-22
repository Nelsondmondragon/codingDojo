import java.util.ArrayList;
import java.util.Arrays;

public class Calculadora {

    private ArrayList<Double> numbers;
    private ArrayList<String> operations;

    private String stringValue;
    private double resultado;


    public Calculadora() {
        numbers = new ArrayList<>();
        operations = new ArrayList<>();
    }

    public void realizarOperacion(String value) {
        try {
            if (!this.operations.isEmpty()) {
                String operation = this.operations.get(this.operations.size() - 1);
                if (operation.equals("*") || operation.equals("/")) {
                    int index = this.numbers.size() - 1;
                    if ("*".equals(operation)) {
                        this.numbers.set(index, this.numbers.get(index) * Double.parseDouble(value));
                    } else {
                        this.numbers.set(index, this.numbers.get(index) / Double.parseDouble(value));
                    }
                    this.operations.remove(this.operations.size() - 1);
                    return;
                }
            }
            this.numbers.add(Double.parseDouble(value));
        } catch (NumberFormatException e) {
            this.operations.add(value);
        }
    }

    public double getResultados() {
        while (this.operations.size() > 0 && !this.operations.get(0).equals("=")) {
            switch (this.operations.get(0)) {
                case "+":
                    this.numbers.set(0, this.numbers.get(0) + this.numbers.get(1));
                    break;
                case "-":
                    this.numbers.set(0, this.numbers.get(0) - this.numbers.get(1));
                    break;
            }
            this.numbers.remove(1);
            this.operations.remove(0);
        }
        return this.numbers.get(0);
    }

}
