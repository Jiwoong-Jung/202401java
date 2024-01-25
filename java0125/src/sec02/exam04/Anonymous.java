package sec02.exam04;

public class Anonymous {
	int field;
	void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
//		var2 = 20;
		field = 10;
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
//		int x = calc.sum();
		System.out.println(calc.sum());
	}
	
	
	public static void main(String[] ar) {
		Anonymous anony = new Anonymous();
		anony.method(0, 0);
	}
}
