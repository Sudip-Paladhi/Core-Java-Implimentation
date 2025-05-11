package CoreJava;

public class MethodOverLoading {

    public void payment(int a) {
        System.out.println("Paid by : " + a);
    }

    public void payment(String upi) {
        System.out.println("paid by UPI id : " + upi);
    }

    public void payment() {
        System.out.println("Pay leter.");
    }

    public static void main(String[] args) {
        MethodOverLoading m = new MethodOverLoading();
        m.payment();
        m.payment(150);
        m.payment("123456789");
    }
}
