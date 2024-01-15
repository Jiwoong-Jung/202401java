package com.array;

public class ConsoleEx {

	public static void main(String[] args) {
		Console con = System.console();
		System.out.print("입력: ");
		String str = con.readLine();
		System.out.println(str);
		System.out.print("입력: ");
		str = con.readLine();
		System.out.println(Integer.parseInt(str));
		System.out.print("암호: ");
		char[] charPass = con.readPassword();
		String strPass = new String(charPass);
		System.out.println(strPass);

	}

}
