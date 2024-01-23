package page413;

public class A {
	int field1;
	void method1() {
		System.out.println("method1()");
	}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			System.out.println("method() ,"+field1);
		}
	}
	
	public static void main(String[] ar) {
		System.out.println("실행");
	}
}
