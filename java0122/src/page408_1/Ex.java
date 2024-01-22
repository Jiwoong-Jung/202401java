package page408_1;

public class Ex {

	public static void main(String[] args) {
//		A a = new A();
//		A.B b = a.new B();
		A.B b = new A().new B();
		b.field1 = 3;
		b.method1();
	}

}
