package desafiobarista;

import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] price) {
        double sum = 0;
        for (double d : price) {
            sum += d;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        String userName = System.console().readLine();
        System.out.println(String.format("¡Hola, [%s]!", userName));
        System.out.println(String.format("Hay %s personas frente a ti", customers.size()));
        customers.add(userName);
        for (String string : customers) {
            System.out.println(string);
        }
    }
}
