package design.pattern;

// 자동차 생산 공정 규격
public abstract class CarFactory {
    public abstract TireProduct createTire();
    public abstract DoorProduct createDoor();
}
