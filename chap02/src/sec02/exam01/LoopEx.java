package sec02.exam01;

public class LoopEx {

	public static void main(String[] args) {
		for (int i=0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("-----------");
		int k = 0;
		for (;;) {
			if (k >= 10) {
				break;
			}
			System.out.println(k);
			k++;
		}
		System.out.println("-----------");
		int i=0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----------");
		int j=0;
		do {
			System.out.println(j);
			j++;
		} while(j < 10);

	}

}
