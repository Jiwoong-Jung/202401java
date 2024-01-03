package sec03.exam01;

import java.util.Random;
import java.util.Scanner;

public class GameMulti {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num1 = random.nextInt(10)+1; // 한자리 랜덤 정수
		int num2 = random.nextInt(99)+1; // 두자리 랜덤 정수
		int multi = num1 * num2;
		
		System.out.printf("%d X %d = ?\n", num1, num2);
		for (;;) { // 무한 반복 (무한 루프)
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
		System.out.println("종료");

	}

}
