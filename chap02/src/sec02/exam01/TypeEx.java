package sec02.exam01;

public class TypeEx {

	public static void main(String[] args) {
		String str3 = "3.14";
		double value = Double.parseDouble(str3);
		
		String str2 = "" + 10 + 2;  // 문자열로 만들기
		System.out.println(str2);
		int num1 = Integer.parseInt(str2); // 정수로 만들기
		
		String str = 10 + 2 + "";  // 문자열로 만들기
		System.out.println(str);
		
		String str1 = String.valueOf(10+2); // 문자열로 만들기
		
		System.out.println(1/2.0);
		
		int x = 1;
		int y = 2;
		double result2 = x / (double) y;
		System.out.println(result2);
		
		int value1 = 10;
		int value2 = 100;
		int sum = value1 + value2;
		
		int intValue = 10;
		double doubleValue = 5.5;
		int result = (int) (intValue + doubleValue);
		System.out.println(result);
		
		byte var1 = 127;
		int var2 = 129;
		long var3 = 100000000L;
		float var4 = var3;
		System.out.println(var4);
		
		var1 = (byte) var2;
		System.out.println(var1);
	}

}
