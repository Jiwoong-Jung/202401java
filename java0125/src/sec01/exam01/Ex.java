package sec01.exam01;

class ThrowClass {
	void method() throws Exception {
		throw new Exception("예외 발생");
	}
}

public class Ex {

	public static void main(String[] args) {
		ThrowClass tc = new ThrowClass();
		try {
			tc.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
