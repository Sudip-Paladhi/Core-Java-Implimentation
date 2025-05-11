package CoreJava;

public class MyInterface implements Runnable{
    public void run(){
        for (int i = 0; i <=10; i++) {
            try{
                System.out.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyInterface m= new MyInterface();
        Thread thread = new Thread(m);

        MyThread m1= new MyThread();
        m1.start();
        thread.start();
    }
}