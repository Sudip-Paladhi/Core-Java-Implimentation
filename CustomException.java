package CoreJava;

import java.util.Scanner;

class AboveAgeException extends RuntimeException {
    AboveAgeException(String msg) {
        super(msg);
    }
}

class BelowAgeException extends RuntimeException {
    BelowAgeException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age > 60) {
            throw new AboveAgeException("your age is high.");
        } else if (age < 18) {
            throw new BelowAgeException("Your age is low.");
        } else {
            System.out.println("Submited Sucessfully.");
        }
    }
}
