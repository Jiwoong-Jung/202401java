package exem;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing extends JFrame implements ActionListener{
	JButton jb1 = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	public Swing() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jb1);
		con.add(jb2);
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	

	public static void main(String[] args) {
		new Swing();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb1) {
			System.out.println("jb1");
		} else if(e.getSource() == jb2) {
			System.out.println("jb2");
		}
	}

}
