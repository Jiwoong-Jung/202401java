package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
	public static int createNumber(Random random) {
		//Random random = new Random();
		return random.nextInt(10)+1;
	}
	
	public static void multiplication() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = createNumber(random); // 한자리 랜덤 정수
		int num2 = random.nextInt(10)+1; // 두자리 랜덤 정수
		int multi = num1 * num2;
		
		System.out.printf("%d X %d = ?\n", num1, num2);
		for (;;) {
			System.out.print("입력>");
//			int answer = scan.nextInt();
			int answer = Integer.parseInt(scan.nextLine());
			if (answer == multi) {
				System.out.println("정답입니다!");
				break; // 루프 탈출
			} else {
				System.out.println("오답입니다!");
			}
		}
	}
	
	public static void main(String[] ar) {
		for (int i=0; i<3; i++) {
			multiplication();
		}
		System.out.println("종료");
	}
}
