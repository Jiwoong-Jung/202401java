package sec01.exam02;

public interface InterTest {
	void test();  // 추상 메소드
	default void test1() {
		System.out.println("test1()");
	}
}
