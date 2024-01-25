package sec02.exam02;

class AnyClass {
	void anyMethod() throws Exception {}
	void method() {
		try {
			anyMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Ex {
	public static void main(String[] args) {
		AnyClass ac = new AnyClass();
		ac.method();
	}
}
