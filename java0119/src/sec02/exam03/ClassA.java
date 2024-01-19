package sec02.exam03;

interface InterA {
	void method();
}
class ClassB implements InterA {
	@Override
	public void method() {}
}
public class ClassA extends ClassB {
	public static void main(String[] ar) {
		InterA ita = new ClassA();
	}
}
