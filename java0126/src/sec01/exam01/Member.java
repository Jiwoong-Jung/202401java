package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;  // 강제 형변환을 왜?
			if (id.equals(member.id)) {  // 문자열 비교하려고
				return true;
			}
		}
		return false;
	}
	
	
	
}
