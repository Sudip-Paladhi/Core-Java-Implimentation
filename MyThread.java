package CoreJava;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >=0 ; i--) {
            try {
                System.out.println("i value is = " + i);
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
