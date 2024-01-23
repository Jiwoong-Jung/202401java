package page413;

public class A {
	public static void main(String[] ar) {
		A a = new A();
		B b = a.new B();
		b.method();
	}
	
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
	
	
}
