package sec01.exam22;

public class BoxingEx {

	public static void main(String[] args) {
		int x = 100;
		String str = "가나다";
		Integer obj2 = Integer.valueOf("100");
		Integer obj1 = 300;
		System.out.println(obj1);
		int y = obj1.intValue();
		System.out.println(y);
		int z = x + obj1;
		System.out.println(z);
	}

}
