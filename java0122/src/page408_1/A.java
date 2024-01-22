package page408_1;

public class A {
	static int field3;
	class B {
		B() {}
		int field1;
//		static int field2; // 왜?
		void method1() {}
//		static void method2() {}
	}
	void methodA() {
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
}
