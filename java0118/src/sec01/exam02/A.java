package sec01.exam02;

public interface A {
	void methodA();
	default void test2() {
		test();
	}
	private void test() {
		
	}
	static void test3() {
		
	};
}
