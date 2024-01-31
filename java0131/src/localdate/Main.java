package localdate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 현재 날짜 가져오기
        LocalDate currentDate = LocalDate.now();
        System.out.println("현재 날짜: " + currentDate);

        // 특정 날짜 생성하기
        LocalDate customDate = LocalDate.of(2024, 2, 1);
        System.out.println("특정 날짜: " + customDate);

        // 날짜 간 차이 계산하기
        LocalDate futureDate = LocalDate.of(2026, 2, 15);
        long daysUntilFuture = currentDate.until(futureDate).getDays();
        System.out.println("현재 날짜부터 특정 날짜까지 남은 일수: " + daysUntilFuture);
    }
}

