package localdatetime;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // 현재 날짜와 시간 가져오기
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + currentDateTime);

        // 특정 날짜와 시간 생성하기
        LocalDateTime customDateTime = LocalDateTime.of(2024, 1, 30, 12, 30, 15);
        System.out.println("특정 날짜와 시간: " + customDateTime);

        // 날짜와 시간 간 차이 계산하기
        LocalDateTime futureDateTime = LocalDateTime.of(2025, 1, 1, 15, 0, 0);
        long minutesUntilFuture = java.time.Duration.between(currentDateTime, futureDateTime).toMinutes();
        System.out.println("현재 날짜와 시간부터 특정 날짜와 시간까지 남은 분: " + minutesUntilFuture);
    }
}

