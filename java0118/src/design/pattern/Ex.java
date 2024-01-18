package design.pattern;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
//		CarFactory carFactory = new StateCarFactory();
		Scanner scan = new Scanner(System.in);
		CarFactory carFactory = null;
		System.out.println("생산하려는 차종을 선택 (1:국산차, 2:미국차)");
		System.out.print("선택:");
		String key = scan.nextLine();
		switch (key) {
		case "1":
			carFactory = new KoreaCarFactory();
			break;
		case "2":
			carFactory = new StateCarFactory();
			break;
		default:
			System.out.println("다시 선택하세요.");
			break;
		}
		TireProduct tireProduct = carFactory.createTire();
		DoorProduct doorProduct = carFactory.createDoor();
		
		String tire = tireProduct.makeAssemble();
		String door = doorProduct.makeAssemble();
		System.out.println(tire);
		System.out.println(door);
		
		//System.out.println(carFactory.createTire().makeAssemble());

	}

}
