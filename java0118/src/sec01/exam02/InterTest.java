package sec01.exam02;

public interface InterTest {
	void test();  // 추상 메소드
	default void test1() {
		System.out.println("test1()");
	}
	default void test3() {
		test4();
	};
	private void test4() {  // 인터페이스 내에서 호출할 용도
		System.out.println("test4()");
	};
	static void test5() {
		System.out.println("test5()");
	}
}
