package swing;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] ar) {
		new MyFrame();
	}
}
