package java0116;

import java.util.Objects;

public class People {
	String name;

	public People() {
		
	}
	public People(String name) {
		this.name = name;
	}
	
	void method1() {}
	
	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(name, other.name);
	}
	
	
}
