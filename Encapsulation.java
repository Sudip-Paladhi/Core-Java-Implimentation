package CoreJava;

public class Encapsulation {
    private int radius;

    void setter(int a) {
        this.radius = a;
    }

    int getter() {
        return radius;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setter(10);
        int c = e.getter();
        System.out.println(c);
    }
}