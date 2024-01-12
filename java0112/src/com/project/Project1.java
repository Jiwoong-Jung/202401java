package com.project;

import java.util.Scanner;

public class Project1 {
	static Scanner scanner = new Scanner(System.in);
	public static void disp1() {
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
	}
	
	public static void disp2() {
		System.out.println("-------------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.상위메뉴");
		System.out.println("-------------------------------------");
	}
	
	public static void menu2(Session session) {
		while (session.isRun2()) {
			disp2();
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
//				session.setRun2(false);
				session.setMenuState(MenuState.DEPOSIT_EXIT);
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
	public static void menu1(Session session) {
		while (session.isRun()) {
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
				if (session.getLoginInfo() != null) { // 로그인 성공 후
//					session.setRun2(true);
					session.setMenuState(MenuState.DEPOSIT);
					menu2(session);
				}
				break;
			case 4:
//				session.setRun(false);
				session.setMenuState(MenuState.TOP_EXIT);
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	public static void main(String[] args) {
		LoginInfo loginInfo = new LoginInfo("id", "pass");
		Session session = new Session(true, false, loginInfo);
		menu1(session);
	}
}






