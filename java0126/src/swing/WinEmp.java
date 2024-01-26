package swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WinEmp extends JFrame {
	JButton bt1 = new JButton("버튼1");
	JButton bt2 = new JButton("버튼2");
	JButton bt3 = new JButton("버튼3");
	JButton bt4 = new JButton("버튼4");
	JButton bt5 = new JButton("버튼5");
	public WinEmp() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(bt1, BorderLayout.EAST);
		con.add(bt2, BorderLayout.WEST);
		con.add(bt3, BorderLayout.SOUTH);
		con.add(bt4, BorderLayout.NORTH);
		con.add(bt5, BorderLayout.CENTER);
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new WinEmp();
	}
}
