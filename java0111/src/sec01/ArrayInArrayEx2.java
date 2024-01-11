package sec01;

class ArrayInArrayEx2 {

	public static void main(String[] args) {
		int[][] scores = {{95, 80}, 
				          {92, 96}}; // 2차원
		
		int sum = 0;
		for (int i=0; i < scores.length; i++) {
			for (int j=0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println(sum);
			sum = 0;
		}
		
		for (int i=0; i < scores.length; i++) {
			for (int j=0; j < scores[i].length; j++) {
				sum += scores[j][i];
			}
			System.out.println(sum);
			sum = 0;
		}
	}

}
