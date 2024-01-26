package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(bt1); jp1.add(bt2); jp1.add(bt3); 
		jp1.add(bt4); jp1.add(bt5);
		con.add(jp1, BorderLayout.SOUTH);
//		con.add(bt1, BorderLayout.EAST);
//		con.add(bt2, BorderLayout.WEST);
//		con.add(bt3, BorderLayout.SOUTH);
//		con.add(bt4, BorderLayout.NORTH);
//		con.add(bt5, BorderLayout.CENTER);
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new WinEmp();
	}
}
