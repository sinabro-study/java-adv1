package thread.problem;

import static thread.util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A", 1000), "Thread-A");
        Thread threadB = new Thread(new PrintWork("B", 500), "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class PrintWork implements Runnable {

        private final long mills;
        private final String text;

        public PrintWork(String text, long mills) {
            this.mills = mills;
            this.text = text;
        }

        @Override
        public void run() {
            while (true) {
                log(text);
                try {
                    Thread.sleep(mills);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
