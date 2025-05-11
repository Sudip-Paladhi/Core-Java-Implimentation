package CoreJava;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 5000;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter amount here : ");
            int amount = sc.nextInt();
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance!");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using the ATM.");
        }
    }
}
