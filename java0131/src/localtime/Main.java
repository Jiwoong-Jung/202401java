package localtime;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // 현재 시간 가져오기
        LocalTime currentTime = LocalTime.now();
        System.out.println("현재 시간: " + currentTime);

        // 특정 시간 생성하기
        LocalTime customTime = LocalTime.of(12, 30, 15);
        System.out.println("특정 시간: " + customTime);

        // 시간 간 차이 계산하기
        LocalTime futureTime = LocalTime.of(18, 0, 0);
        long secondsUntilFuture = currentTime.until(futureTime, java.time.temporal.ChronoUnit.SECONDS);
        System.out.println("현재 시간부터 특정 시간까지 남은 초: " + secondsUntilFuture);
    }
}

