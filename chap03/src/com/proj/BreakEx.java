package com.proj;

public class BreakEx {

	public static void main(String[] args) {
		for (int i=0; i < 100; i++) {
			if (i == 55) {
//				break;  // 루프를 탈출
				continue;
			}
			System.out.println(i); // 문제? 
		}
		System.out.println("종료");
	}

}
