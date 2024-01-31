package sec01.verify.exam04;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	
}
