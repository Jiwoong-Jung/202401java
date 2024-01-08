package sec01.exam01;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.print("학생수: ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum]; // 힙영역에 만들어지고 초기화 모두 0
				break;
			case 2:
				for (int i=0; i < scores.length; i++) {
					System.out.print("점수"+(i+1)+": ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case 3:
				for (int i=0; i < scores.length; i++) {
					System.out.println("점수"+(i+1)+": "+scores[i]);
				}
				break;
			case 4:
				int max = 0, sum = 0;
				double avg = 0.0;
				for (int num : scores) {
					if (max < num) {
						max = num;
					}
					sum += num;
				}
				avg = sum / (double) studentNum;
				System.out.println("최고: "+max);
				System.out.println("총합: "+sum);
				System.out.println("평균: "+avg);
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
