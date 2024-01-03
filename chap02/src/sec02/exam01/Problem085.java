package sec02.exam01;

public class Problem085 {

	public static void main(String[] args) {
		byte byteType = 10;
		char charValue = 'A';
		//short shortValue = charValue; // 자동 타입변환 안됨 (1번)

		String strValue = "A";
		//char var = (char) strValue; // 강제 타입변환 안됨 (2번) 
		// 문자열은 원시자료형이 아님
		
		//byte result = byteType + byteType; 
		// 연산결과가 int로 바뀌기 때문에 자동 타입변환 안됨 (3번)
		
		short s1 = 1;
		short s2 = 2;
		//short result2 = s1 + s2; 
		// 연산결과가 int로 바뀌기 때문에 자동 타입변환 안됨 (4번)
		
		char c1 = 'a';
		char c2 = (char) (c1 + 1);  // 강제 타입변환으로 가능 (5번)
		System.out.println(c2);
		
		int x = 5;
		int y = 2;
		double result3 = x / y;  // 6번 (double도 가능?)
		System.out.println(result3);
		
		double result4 = x / (double)y;  // 7번
		System.out.println(result4);
		
		double var1 = 3.5;
		double var2 = 2.7;
		int result5 = (int) (var1 + var2); // 8번
		System.out.println(result5);
		
		
		long var11 = 2L;
		float var21 = 1.8f;
		double var31 = 2.5;
		String var41 = "3.9";
		int result6 = (int) (var11 + (int)(var21 + var31) + Double.parseDouble(var41));
		System.out.println(result6);
	}

}
