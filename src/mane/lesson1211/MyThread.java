package mane.lesson1211;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("gggo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
