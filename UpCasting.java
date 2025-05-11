package CoreJava;

class vehicle {
    void start() {
        System.out.println("vehicle is started.");
    }
}

class car extends vehicle {
    void drive() {
        System.out.println("car is driving.....");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        vehicle v1 = new car();
        v1.start();
    }
}