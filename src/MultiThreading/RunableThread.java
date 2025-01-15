package MultiThreading;

public class RunableThread implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Runable thread is running " + i);
        }
    }

    public static void main(String[] args) {
        RunableThread runableThread = new RunableThread();
        Thread r = new Thread(runableThread, "This is my new thread");
       // r.run();
        r.start();
       String str =  r.getName();

        System.out.println(str);

    }
}