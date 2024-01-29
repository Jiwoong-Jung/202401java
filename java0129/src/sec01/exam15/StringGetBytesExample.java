package sec01.exam15;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요abc";
		String nstr = str.replace("abc", "감사합니다");
		System.out.println(nstr);
		
		System.out.println(str.length());
		int index = str.indexOf("가요"); // 못찾으면 -1 리턴
		System.out.println(index);
		index = "안녕하세요abc".indexOf("세요");
		System.out.println(index);
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);
		
		try {
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);
			
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);		
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
