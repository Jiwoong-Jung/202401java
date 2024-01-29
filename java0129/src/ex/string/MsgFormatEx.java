package ex.string;

import java.text.MessageFormat;

public class MsgFormatEx {

	public static void main(String[] args) {
		int n = 13;
		String p = "사과";
		String msg 
		= MessageFormat.format("나는 {0}를 {1}개 가졌다", p, n);
		System.out.println(msg);
		
		String str = String.format("나는 %s를 %d개 가졌다", p, n);
		System.out.println(str);
	}

}
