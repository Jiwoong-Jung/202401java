package sec02.prob05;

public class ForTest1 {

	public static void main(String[] args) {
		for (int i=0; i < 4; i++) {
//			System.out.print(i);
			for (int j=0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
