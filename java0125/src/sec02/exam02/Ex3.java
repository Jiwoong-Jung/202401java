package sec02.exam02;

class AnyClass3 {
	void anyMethod() {
		throw new NullPointerException();
	}
}

public class Ex3 {
	public static void main(String[] args) {
		AnyClass3 ac = new AnyClass3();
		try {
			ac.anyMethod();
		} catch(NullPointerException e) {
			
		}
		System.out.println("계속 실행 중");
		
	}

}
