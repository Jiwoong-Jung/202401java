package sec02.exam01;

public class CarEx {

	public static void main(String[] args) {
		String str = "가나다"; // 지역 변수
		
		Car car4 = new Car("현대", "코나", "ver.1", 150);
		System.out.println(car4);
		
		
		Car car3 = new Car("현대자동차");
		System.out.println(car3);
		
		Car car2 = new Car();
		System.out.println(car2);
		
		Car car = new Car();
		car.company = "KIA";
		car.color = "red";
		car.model = "K7";
		car.maxSpeed = 200;
		System.out.println(car);
		

	}

}
