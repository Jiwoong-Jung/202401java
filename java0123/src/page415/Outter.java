package page415;

public class Outter {
	public void method2(int arg) {
		int localVar = 1;
//		arg = 100;
//		localVar = 100;
		class Inner {
			public void method() {
				int result = arg + localVar;
			}
		}
	}
}
