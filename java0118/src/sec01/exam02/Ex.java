package sec01.exam02;

public class Ex {

	public static void main(String[] args) {
//		new RemoteControl();
		
		RemoteControl rc;
		rc = new Audio();
		rc.turnOn();
		System.out.println(rc.MAX_VOLUME);
//		rc.MAX_VOLUME = 100;
	}

}
