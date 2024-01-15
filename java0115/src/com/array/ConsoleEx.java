package com.array;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		Console con = System.console();
		System.out.print("입력: ");
		String str = con.readLine();
		System.out.println(str); // 문자열 입력
		System.out.print("입력: ");
		str = con.readLine();
		// 문자열을 정수로 변환
		System.out.println(Integer.parseInt(str));
		System.out.print("암호: ");
		// 암호는 char 배열 타입만 가능
		char[] charPass = con.readPassword();
		//암호를 문자열로 생성
		String strPass = new String(charPass);
		System.out.println(strPass);

	}

}
