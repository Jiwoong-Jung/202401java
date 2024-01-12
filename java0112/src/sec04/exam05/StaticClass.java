package sec04.exam05;
class MyClass {
	void method1() {
		System.out.println(this.toString());
		System.out.println("method1");
	}
	static void method2() {
		System.out.println("method2");
	}
}
public class StaticClass {
	static void method3() {
		System.out.println("method3");
	}
	public static void main(String[] args) {
		StaticClass.method3();
		MyClass.method2();
		MyClass mc = new MyClass();
		mc.method1();
		mc.method2();
		MyClass mc2 = new MyClass();
		mc2.method1();
		mc2.method2();
	}
}
