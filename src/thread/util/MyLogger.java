package thread.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * abstract로 선언하여 MyLogger를 직접 생성하지 못하도록 제한
 * log를 static으로 정의하여 다른 클래스에서 직접 사용할 수 있도록 구현
 */
public abstract class MyLogger {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static void log(Object obj) {
        String time = LocalTime.now().format(formatter);

        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    }
}
