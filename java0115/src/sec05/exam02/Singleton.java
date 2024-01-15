package sec05.exam02;

public class Singleton {
	// private 접근제한은 자신 클래스 내에서만 접근 가능
	private static Singleton singleton = new Singleton();
	private Singleton() {} // 생성자를 private으로 하면?
	public static Singleton getInstance() { // 사용법은 오직 이 메소드만 호출
		return singleton;
	}
}
