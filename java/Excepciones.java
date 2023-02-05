import java.util.ArrayList;
import java.util.List;

public class Excepciones {

    public static void main(String[] args) {

        try {
            List<Object> myList = new ArrayList<>(List.of(2, "ddd", 4, 5, 6, 7, 8, 8));

            for (Object integer : myList) {
                int num = (int) integer;
            }
            System.out.println("dddd");

        } catch (Exception i) {
            System.out.println("error");
        }

    }
}
