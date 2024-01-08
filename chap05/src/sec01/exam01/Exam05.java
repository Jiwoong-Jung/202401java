package sec01.exam01;

public class Exam05 {

	public static void main(String[] args) {
//		int[] array2 = {80, 78, 97};
		double[] array = new double[] {83.0, 90.0, 87.0};
		double sum = 0;
		double avg;
		for (double num : array) {
			sum += num;
		}
		System.out.println("총합: " + sum);
		avg = sum / array.length;
		System.out.println("평균: " + avg);
		// 총합, 평균 출력

	}

}
