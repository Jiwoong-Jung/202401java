package sec01.exam01;

public class Prob13 {

	void method() {
		System.out.println("method()");
	}
	void method2() {
		try {
			return;
//			method();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("method2()-finally");
		}
	}
	public static void main(String[] args) {
		Prob13 pr = new Prob13();
		pr.method2();

	}

}
