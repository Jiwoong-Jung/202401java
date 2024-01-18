package sec03.exam01;

public class Ex1 {

	public static void main(String[] args) {
		Phone phone = new SmartPhone2();
		System.out.println(phone.x);
		
		
		if (phone instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone) phone;
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		
	}

}
