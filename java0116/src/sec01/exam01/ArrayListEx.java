package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		String[] strArr = new String[100];  // 고정형 배열, 속도빠름
		ArrayList<String> alist = new ArrayList<String>();
		// '어레이리스트'라고 읽음. 문자열을 가변적인 배열로
		List<String> list = new ArrayList<>();  // 축약형
		list.add("홍길동");
		list.add("김하나");
		list.add("강하나");
		for (String str : list) {
			System.out.println(str);
		}
		list.set(1, "박하나");
		for (String str : list) {
			System.out.println(str);
		}
		
	}

}
