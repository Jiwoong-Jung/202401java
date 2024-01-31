package sec01.verify.exam04;

public class MemberEx {

	public static void main(String[] args) {
		Class clazz = Member.class;
		System.out.println(clazz.getName());
		
		Member member = new Member("blue", "이파란");
		System.out.println(member);

	}

}
