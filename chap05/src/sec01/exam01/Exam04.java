package sec01.exam01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		int max = 0;
		int index = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력할 개수:");
		int count = scan.nextInt();
		int[] intNum = new int[count];
		
		for (int i=0; i < intNum.length; i++) {
			System.out.print("정수입력:");
			intNum[i] = scan.nextInt();
		}
		for (int val : intNum) {
			if (max < val) {  // 최대값
				max = val;
			}
		}
		System.out.println("최대값:" + max);
		
		max = 0;
		int[] array = {1,5,3,8,2};
		
		int i = 0;
		for (int num : array) {
			if (max < num) {
				max = num;
				index = i;
			}
			i++;
		}
		
//		for (int i=0; i < array.length; i++) {
//			if (max < array[i]) { // max 값과 배열의 값을 비교
//				max = array[i];  // max보다 큰 값을 max에 저장
//				index = i;
//			}
//		}
		
		System.out.println("최대값: " + max);
		System.out.println("인덱스: " + index);

	}

}
