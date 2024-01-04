package sec03.exam01;

import java.util.Scanner;

public class Apply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]"); 
		System.out.print("1. 이름: ");
		String name = scanner.nextLine(); 
		System.out.print("2. 주민번호 앞 6자리: ");
		String ssn = scanner.nextLine(); 
		System.out.print("3. 전화번호: "); 
		String tel = scanner.nextLine();
		System.out.println();
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + name);
		System.out.println("2. 주민번호 앞 6자리: " + ssn); 
		System.out.println("3. 전화번호: " + tel);

	}

}
