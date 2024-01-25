package sec02.exam02;

class AnyClass {
	void anyMethod() throws Exception {}
	void method() throws Exception {
		this.anyMethod();
	}
}


public class Ex {

	public static void main(String[] args) {
		AnyClass ac = new AnyClass();
		try {
			ac.method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
