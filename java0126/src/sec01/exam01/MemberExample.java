package sec01.exam01;


public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("bLUe");
		Member obj3 = new Member("red");
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj3);
//		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		if(obj1.equals(obj2)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
	}
}
