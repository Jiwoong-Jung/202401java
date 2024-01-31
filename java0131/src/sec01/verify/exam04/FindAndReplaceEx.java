package sec01.verify.exam04;

public class FindAndReplaceEx {

	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		
		
		String str = "모든 프로그램은 자바 언어로";
		int index = str.indexOf("자바"); // 위치를 정수로
		System.out.println(index);
		str = str.replace("자바", "Java");  //새로운 문자열
		System.out.println(str);

	}

}
