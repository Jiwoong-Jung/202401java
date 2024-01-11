package sec01;

public class Exercise05 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0, count = 0;
		double avg = 0.0;
		for (int[] arr : array) {  // 향상된 for문 (for-each문)
			for (int val : arr) {
				sum += val;
				count++;
			}
		}
		avg = sum / (double)count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
