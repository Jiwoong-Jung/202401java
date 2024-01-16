package com.miniProject1;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.회원출력 | 2.회원등록 | 3.파일저장 | 4.파일읽기 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.println("회원출력");
				break;
			case 2:
				System.out.println("회원등록");
				break;
			case 3:
				System.out.println("파일저장");
				break;
			case 4:
				System.out.println("파일읽기");
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
		
	}
}
