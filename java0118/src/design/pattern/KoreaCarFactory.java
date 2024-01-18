package design.pattern;

// 국산차 생산 공장
public class KoreaCarFactory extends CarFactory{

    @Override
    public TireProduct createTire() {
        return new KoreaTireProduct();
    }

    @Override
    public DoorProduct createDoor() {
        return new KoreaDoorProduct();
    }
}
