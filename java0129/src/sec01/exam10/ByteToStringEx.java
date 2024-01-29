package sec01.exam10;

public class ByteToStringEx {

	public static void main(String[] args) {
		String sub = "자바 프로그래밍";
		System.out.println(sub.charAt(3));
		
		
		byte[] bytes = {72,101,108,108,111};
		String str = new String(bytes, 1, 2);
		System.out.println(str);
		
		char[] chars = {'가', 'e', 'l', '나', 'o'};
		str = new String(chars);
		System.out.println(str);
	}

}
