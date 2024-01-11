package sec01;

public class Ex4 {

	public static void main(String[] args) {
		int a[] = {10, 3, 1, 4, 2};
		
		int idx = -1;
		for (int i=0; i < a.length; i++) {
			if (a[i] == 4) {
				idx = i;
			}
		}
		if (idx != -1) {
			System.out.println("인덱스: " + idx);
		} else {
			System.out.println("못찾음");
		}

	}

}
