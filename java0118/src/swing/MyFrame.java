package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();  // 컴포넌트 붙이는 곳
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
		this.setTitle("오늘은 이벤트");
		
		JButton jb = new JButton("클릭");
		con.add(jb);
	}
	
	public static void main(String[] ar) {
		new MyFrame();
	}
}
