package com.proj;

import java.util.Scanner;

public class ScoreEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수>");
		int score = scan.nextInt();
		int grade = score/10;
		switch (grade) {
		case 10:
		case 9:
			System.out.println("A 입니다");
			break;
		case 8:
			System.out.println("B 입니다");
			break;
		case 7:
			System.out.println("C 입니다");
			break;
		default:
			System.out.println("D 입니다");
			break;
		}
		
		
	}

}
