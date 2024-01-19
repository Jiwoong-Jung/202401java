package sec02.exam03;

import java.util.ArrayList;
import java.util.List;

class Acc {
	
}
public class VehicleEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
//		list.add(123);
		list.add("문자열");
//		list.add(3.14);
//		list.add(new Acc());
		
		for (Object obj : list) {
			String str = (String) obj;
			System.out.println(obj);
		}
		
		Vehicle vehicle = new Bus();

	}

}
