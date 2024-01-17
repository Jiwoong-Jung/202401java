package com.miniProject7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Account> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.회원출력 | 2.회원등록 | 3.파일저장 | 4.파일읽기 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.println("회원출력");
				for (Account account : list) {
					System.out.println(account);
				}
				break;
			case 2:
				System.out.println("회원등록");
				System.out.print("이름:");
				String name = scanner.nextLine();
				System.out.print("아이디:");
				String id = scanner.nextLine();
				System.out.print("패스워드:");
				String pass = scanner.nextLine();
				System.out.print("전화번호:");
				String tel = scanner.nextLine();
				System.out.print("생년월일:");
				String ssn = scanner.nextLine();
				list.add(new Account(name, id, pass, tel, ssn));
				break;
			case 3:
				System.out.println("파일저장");
				FileOutputStream fos = new FileOutputStream("c:/temp/acc.db");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(list);
				oos.flush();
				oos.close();
				break;
			case 4:
				System.out.println("파일읽기");
				FileInputStream fis = new FileInputStream("c:/temp/acc.db");
				ObjectInputStream ois = new ObjectInputStream(fis);
				list = (List<Account>) ois.readObject();
				for (Account account : list) {
					System.out.println(account);
				}
				ois.close();
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
		
	}
}
