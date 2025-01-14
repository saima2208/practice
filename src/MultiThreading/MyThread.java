package MultiThreading;

public class MyThread extends Thread{
    public void run(){
        for (int i = 1; i<=10; i++) {
            System.out.println("Thread is running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
       myThread.start();
      // myThread.run();


        System.out.println("Thread is also running");
        for (int i =0; i<10;i++){
            Thread.sleep(2000);
            System.out.println("Bangladesh " + i);
        }

    }
}
