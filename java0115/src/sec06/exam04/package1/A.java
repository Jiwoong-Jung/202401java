package sec06.exam04.package1;

public class A {
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자 오버로딩
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
}
