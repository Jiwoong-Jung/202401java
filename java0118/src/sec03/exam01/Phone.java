package sec03.exam01;

public abstract class Phone {
	int x;

	public Phone(int x) {
		super();
		this.x = x;
	}
	
	public abstract String ring(int tel);
	
}
