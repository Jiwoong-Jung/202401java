package swing;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	class MyEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(tf.getText());
		}
	}
	String str = "안녕";
	JTextField tf = new JTextField(10);
	JButton bt = new JButton("실행");
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);
		con.add(tf); con.add(bt);
		bt.addActionListener(new MyEvent());
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
