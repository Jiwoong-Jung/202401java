package sec01.exam02;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;  // 상수
	int MIN_VOLUME = 0;
	int x = 100; // 상수
	
	public abstract void turnOn();  // 추상메소드
	void turnOff();
}
