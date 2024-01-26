package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("김하나", 85);
		map.put("이하나", 70);
		map.put("김하나", 90);
		map.put("박하나", 95);
		System.out.println(map.get("김하나"));
		System.out.println(map.size());
	}

}
