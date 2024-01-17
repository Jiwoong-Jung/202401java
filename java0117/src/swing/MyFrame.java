package swing;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);  // 크기 설정
		this.setVisible(true);  // 윈도우 프레임을 보이게
	}
	
	public static void main(String... ar) {
		new MyFrame();
	}
}
