package sec02.exam01;

public class MethodEx {

	public static void method(int x, int y) { // 메서드 정의
		System.out.println(x + y);
	}

	public static int method2(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		method(100, 200); // 호출
		int ret = method2(300, 400);
		System.out.println(ret);
	}

}
