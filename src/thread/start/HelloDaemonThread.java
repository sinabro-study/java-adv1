package thread.start;

public class HelloDaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": run() start");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ": run() end");
    }
}
