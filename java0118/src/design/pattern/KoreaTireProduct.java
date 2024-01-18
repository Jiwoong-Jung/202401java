package design.pattern;

//국산 타이어 생산
public class KoreaTireProduct extends TireProduct {
    @Override
    public String makeAssemble() {
        return "국산 타이어";
    }
}
