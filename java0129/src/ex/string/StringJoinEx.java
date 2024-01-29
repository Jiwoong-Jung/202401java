package ex.string;

import java.util.ArrayList;
import java.util.List;

public class StringJoinEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("나는");
		list.add("라면을");
		list.add("좋아합니다");
		String msg = String.join(" ", list);
		System.out.println(msg);
		
		String msg2 = String.join(".", "www", "naver", "com");
		System.out.println(msg2);
	}

}
