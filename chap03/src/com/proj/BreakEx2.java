package com.proj;

public class BreakEx2 {

	public static void main(String[] args) {
		AAA: for (int i=0; i < 10; i++) {
			for (int j=0; j < 10; j++) {
				if (i == 3 && j == 3) {
					break AAA;
				}
				System.out.printf("(%d, %d)\n", i, j);
			}
		}

	}

}
