package sec04.exam05;

public class Car {

	int speed = 10;

	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("시동 후 "+speed+"km");
	}	
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(속도:" + speed + "km/h)");
		}
	}	
}
