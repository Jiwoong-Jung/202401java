package sec01.exam01;


public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("BLUE");
		Member obj3 = new Member("red");
		
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
