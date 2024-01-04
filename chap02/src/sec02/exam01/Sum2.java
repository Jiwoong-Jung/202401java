package sec02.exam01;

import java.util.Scanner;

public class Sum2 {

	public static void sum_multi(int num1, int num2, String op) {
		if (op.equals("*")) {
			int result = num1 * num2;
			System.out.println("곱셈 결과:" + result);
		} else if (op.equals("+")) {
			int result = num1 + num2;
			System.out.println("덧셈 결과:" + result);
		}
	}
	
	public static void multi(int num1, int num2) { // 곱하기 메서드 선언
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);
	}
	
	public static void sum(int num1, int num2) { // 더하기 메서드 선언
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}
	
	public static void main(String[] args) { // 실행
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine(); 
		System.out.print("두번째 수:"); 
		String strNum2 = scanner.nextLine();
		int n1 = Integer.parseInt(strNum1);
		int n2 = Integer.parseInt(strNum2);
//		sum(n1, n2);
		// 곱하기 메서드 호출
//		multi(n1, n2);
		
		sum_multi(n1, n2, "+");
		sum_multi(n1, n2, "*");
	}

}
