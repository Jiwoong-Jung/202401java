package chap7.prob3;

public class Ex {

	public static void main(String[] args) {
		B b1 = new B();  // 1번
		B b3 = new D();  // 3번
		B b4 = new E();  // 4번
		
//		B b2 = (B) new A();
		
		A a = new A();
		if (a instanceof B) {
			B b = (B) a;
			System.out.println("변환 가능");
		} else {
			System.out.println("변환 불가능");
		}
		

	}

}
