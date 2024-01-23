package sec01.exam06;

import java.util.Scanner;

public class ButtonExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Button btn = new Button();
		Button.OnClickListener listener = null;
		System.out.print("선택(1:전화, 2:메시지):");
		String str = scan.nextLine();
		switch(str) {
		case "1":
			listener = new CallListener();
			break;
		case "2":
			listener = new MessageListener();
			break;
		default:
			System.out.println("다시 선택하시기 바랍니다.");
		}
		btn.setOnClickListener(listener);
		btn.touch();
	}
}
