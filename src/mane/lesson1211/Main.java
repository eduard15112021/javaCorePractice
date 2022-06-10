package mane.lesson1211;
//потоки

public class Main {
    public static void main(String[] args)throws Exception {
      Thread mainThread =Thread.currentThread();
//        System.out.println(mainThread.getName());

//        mainThread.setName("go");
        MyThread myThread=new MyThread();
        myThread.setDaemon(true);
        myThread.start();
//        mainThread.sleep(4000);
        System.out.println(mainThread.getName());

        NextThread nextThread=new NextThread();
        nextThread.run();
        Thread t =new Thread(nextThread, "fghjk");
        t.start();

    }
}
