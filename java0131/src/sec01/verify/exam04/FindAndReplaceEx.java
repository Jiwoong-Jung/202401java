package sec01.verify.exam04;

public class FindAndReplaceEx {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로";
		int index = str.indexOf("자바");
		System.out.println(index);
		str = str.replace("자바", "Java");
		System.out.println(str);

	}

}
