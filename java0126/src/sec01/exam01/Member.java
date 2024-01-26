package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) { // 매개변수 다형성
		if (obj instanceof Member) {   // Member로 객체생성?
			Member member = (Member) obj;  // 강제 형변환을 왜?
			if (id.equalsIgnoreCase(member.id)) {  // 문자열 비교하려고
				return true;
			}
		}
		return false;
	}
	
	
	
}
