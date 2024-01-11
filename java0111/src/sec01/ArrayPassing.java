package sec01;

public class ArrayPassing {

	public static void increase(int[] arr) {
		for (int i=0; i < arr.length; i++) {
			arr[i]++;
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
//		increase(a);
		increase(new int[] {1,2,3,4});
		for (int n : a) {
			System.out.println(n);
		}
	}

}
