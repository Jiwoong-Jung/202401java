package sec01;

public class CallByValue {
	public static void increase(int n, MyClass mc) {
		n += 1;
		System.out.println("increase:"+n);
		mc.n += 1;
		System.out.println("increase:"+mc.n);
	}
	public static void main(String[] args) {
		int n = 100;
		MyClass mc = new MyClass();
		System.out.println(mc.n);
//		increase(n, mc);
		increase(n, new MyClass());
		System.out.println(n);
		System.out.println(mc.n);
		
	}
}

class MyClass {
	int n; // 초기값 0
}







