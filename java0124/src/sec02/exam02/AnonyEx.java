package sec02.exam02;

public class AnonyEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트TV를 켜다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트TV를 끄다");
				
			}
		});

	}

}
