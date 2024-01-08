package sec01.exam01;

public class StackEx {

	public static void main(String[] args) {
		int age = 32;
//		int[] intArray = null;
//		intArray[0] = 10;
		
		String str = null;
//		str = "가나다";
		System.out.println(str.length());
		
		String name1 = "신용권";
		String name2 = "신용권";
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		String name3 = new String("신용권");
		String name4 = new String("신용권");
		System.out.println(name3 == name4);
		System.out.println(name3.equals(name4));
	}

}
