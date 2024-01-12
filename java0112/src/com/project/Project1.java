package com.project;

import java.util.Scanner;

public class Project1 {
	static Scanner scanner = new Scanner(System.in);
	public static void disp1() {
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
	}
	
	public static void menu1() {
		boolean run = true;
		while (run) {
			disp1();
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
	public static void main(String[] args) {
		menu1();
	}
}
