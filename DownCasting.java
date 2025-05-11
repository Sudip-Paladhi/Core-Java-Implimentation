package CoreJava;

class engine{
    void work(){
        System.out.println("Car has engine.");
    }
}

class bike extends engine{
    void ride(){
        System.out.println("Bike can ride.");
    }
}

public class DownCasting {
    public static void main(String[] args) {
        engine e1=new bike();
        bike b= (bike) e1;
        b.work();
        b.ride();
    }
}