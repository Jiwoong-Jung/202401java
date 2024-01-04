package com.fine;

public class Ex1 {

	public static void main(String[] args) {
		int var = 3;
		int var1 = 6;
		if (var == var1) {
			System.out.println("같다");	
		} else {
			System.out.println("같지않다");
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			
			sum = sum + i;
			System.out.println(i + ", " + sum);
		}
	}

}
