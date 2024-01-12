package sec04.exam05;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		myCar.run();
		speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
