package sec01;

public class Bubble2 {
	public static void printArr(int a[]) {
		for (int n : a) {
			System.out.print(n+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[] = {10, 3, 1, 4, 2};
		printArr(a);
		for (int i=0; i < a.length; i++) { // 반복 회수
			System.out.print("i="+i+":");
			for (int j=a.length-1; j > i; j--) {
				if (a[j] < a[j-1]) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					System.out.print("\t교환(j-1="+(j-1)+", j="+j+")");
					printArr(a);
				}
			}
			printArr(a);
		}
		printArr(a);
	}
}
