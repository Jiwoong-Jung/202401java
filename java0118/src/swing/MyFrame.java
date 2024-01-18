package swing;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
	}
	
	public static void main(String[] ar) {
		new MyFrame();
	}
}
