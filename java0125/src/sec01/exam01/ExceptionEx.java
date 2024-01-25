package sec01.exam01;

class MyClass2 {
	void method() throws MyException  {
		throw new MyException("나의 예외 상황");
	}
}

public class ExceptionEx {

	public static void main(String[] args) {
		MyClass2 mc = new MyClass2();
		try {
			mc.method();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
