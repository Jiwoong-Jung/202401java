package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);
		JButton jb1 = new JButton("버튼");
		jb1.setLocation(20, 20);
		jb1.setSize(100, 30);
		con.add(jb1);
		
		JLabel jb2 = new JLabel("버튼");
		con.add(jb2);
		jb2.setLocation(120, 20);
		jb2.setSize(100, 30);
		
		JTextField jt1 = new JTextField();
		con.add(jt1);
		jt1.setLocation(220, 20);
		jt1.setSize(100, 30);
		
		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true);  // 윈도우 프레임을 보이게
		this.setSize(500, 300);  // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String... ar) {
		new MyFrame();
	}
}
