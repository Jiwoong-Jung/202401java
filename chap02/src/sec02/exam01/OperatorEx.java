package sec02.exam01;

public class OperatorEx {

	public static void main(String[] args) {
		System.out.println(0.1 == (double)0.1f);
		System.out.println((float)0.1 == 0.1f);
		System.out.println(3 == 3.0);
		System.out.println('A' == 65);
		System.out.println("==============");
		
		boolean b1 = 'A' < 'B';
		System.out.println(b1);
		
		int num2 = 'B' - 'A';
		System.out.println(num2);
		
		String str = "JDK" + (3 + 3.0); // JDK6.0
		System.out.println(str);
		
		for (int i = 0; i < 10; i++) {
			char c1 = (char) ('A' + i);
			System.out.print(c1);
		}
		System.out.println();
		System.out.println("-----------------");
		
		char c1 = 'A' + 1;
		System.out.println(c1);
		System.out.println("-----------------");
		
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) { // 2의 배수
				System.out.println(i);
			}
		}
		System.out.println("-----------------");

		int num = 10 % 3; // 10을 3으로 나눈 나머지 : 1
		System.out.println(num);

		boolean play = true;
		System.out.println(!play);

		int x = 1;
		int y = 1;
		int result1 = ++x + 10; // 12
		System.out.println(result1);
		int result2 = y++ + 10; // 11
		System.out.println(result2);
		System.out.println("x:" + x + ", y:" + y); // 2, 2
		// ++x : x에 1만큼 증가
		byte b = 100;
//		byte result = -b; // -1 * b (연산 결과가 정수)

	}

}
