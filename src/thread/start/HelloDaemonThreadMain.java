package thread.start;

/**
 * DaemonThread는 UserThread가 종료되면 실행 여부에 관련없이 바로 종료됩니다.
 */
public class HelloDaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        System.out.println(Thread.currentThread().getName() + ": start 호출 전");
        HelloDaemonThread thread = new HelloDaemonThread();
        thread.setDaemon(true);
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": start 호출 후");
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
