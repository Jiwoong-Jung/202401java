package sec03.exam01;

public class MethodEx {

	public static void main(String[] args) {
		System.out.println(test("123"));

	}
	
	public static int test(String str) {
		return Integer.parseInt(str);
	}

}
