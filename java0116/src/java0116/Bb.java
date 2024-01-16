package java0116;

class Aa {
	private int y;
	final int x;
	void method() {}
	Aa() {
		this.x = 0;
	}
	Aa(int x) {
		this.x = x;
	}
	Aa(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Bb extends Aa {
	@Override
	void method() {
		super.method();
//		x = 40; final 필드 값 변경 안됨
//		System.out.println(y); private 접근 안됨
	}
}
