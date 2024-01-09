package sec04.exam06;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		Account acc;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("로그인 처리");
				break;
			case 2:
				// 회원 가입
				System.out.println("회원 가입");
				System.out.print("이름: ");
				String name = scanner.nextLine();
				System.out.print("생년월일: ");
				String ssn = scanner.nextLine();
				System.out.print("전화번호: ");
				String tel = scanner.nextLine();
				acc = new Account(name, ssn, tel);
				System.out.println(acc);
				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
