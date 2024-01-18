package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener{
	JButton jb = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	public MyFrame2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();  // 컴포넌트 붙이는 곳
		this.setVisible(true);
		this.setSize(500, 300);
		this.setLocation(300, 300);
		this.setTitle("오늘은 이벤트");
		
		con.setLayout(new FlowLayout());
		
		con.add(jb);
		jb.addActionListener(this);
		
		con.add(jb2);
		jb2.addActionListener(this);
	}
	
	public static void main(String[] ar) {
		new MyFrame2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jb) {
			System.out.println("버튼1");
		} else if (e.getSource()==jb2) {
			System.out.println("버튼2");
		}
		
		
	}
}



