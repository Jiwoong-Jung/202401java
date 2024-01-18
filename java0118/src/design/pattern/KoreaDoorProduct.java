package design.pattern;

// 국산 타이어 생산
public class KoreaDoorProduct extends DoorProduct {
    @Override
    public String makeAssemble() {
        return "문이 열립니다.";
    }
}
