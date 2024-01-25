package sec01.exam01;

public class NFEex {

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt("1a");
			System.out.println(x);
		} catch(NumberFormatException e) {
			System.out.println("숫자 변환 불가");
		}
	}

}
