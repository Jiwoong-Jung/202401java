package com.proj;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수>");
		int score = scan.nextInt();
		if (score <= 100 && score >= 0) {
			if (score >= 90) {
				System.out.println("A 입니다.");
			} else if (score >=80) {
				System.out.println("B 입니다.");
			} else if (score >=70) {
				System.out.println("C 입니다.");
			} else {
				System.out.println("D 입니다.");
			}
		} else {
			System.out.println("점수 오류");
		}
		
		
	}

}
