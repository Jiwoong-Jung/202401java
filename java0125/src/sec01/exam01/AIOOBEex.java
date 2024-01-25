package sec01.exam01;

public class AIOOBEex {

	public static void main(String[] args) {
		try {
			String str = args[0];
			String str1 = args[1];
			
			System.out.println(str);
			System.out.println(str1);
		} catch(ArrayIndexOutOfBoundsException e1) {
//			e.printStackTrace();
			System.out.println(e1.getMessage());
			System.out.println("예외 발생!");
		}
		
	}

}
