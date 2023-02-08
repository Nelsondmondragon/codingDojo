package cuentabancaria;

import java.util.Random;

public class CuentaBancaria {

    private double balanceAccountCo;
    private double balanceAccountAh;
    public static int count;
    public static double balance;
    public String numberAccount;

    CuentaBancaria() {
        numberAccount = this.numberAccountRandom();
        count++;
    }

    private String numberAccountRandom() {
        String number = "";
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            number += random.nextInt(10);
        }
        return number;
    }

    public double getBalanceAccountCo() {
        return this.balanceAccountCo;
    }

    public double getBalanceAccountAh() {
        return this.balanceAccountAh;
    }

    public void depositCo(double amount) {
        this.balanceAccountCo += amount;
        balance += amount;
    }

    public void depositAh(double amount) {
        this.balanceAccountAh += amount;
        balance += amount;
    }

    public void retireCo(double amount) {
        if (this.balanceAccountCo >= amount) {
            this.balanceAccountCo -= amount;
        }

    }

    public void retireAh(double amount) {
        if (this.balanceAccountAh >= amount) {
            this.balanceAccountAh -= amount;
        }
    }

    public double totalAccountCo() {
        return this.balanceAccountCo;
    }

    public double totalAccountAh() {
        return this.balanceAccountAh;
    }
}
