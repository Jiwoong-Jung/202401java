package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WinEmp extends JFrame {
	JLabel lb1 = new JLabel("부서코드:");
	JTextField tf1 = new JTextField(10);
	JLabel lb2 = new JLabel("부서명:");
	JTextField tf2 = new JTextField(10);
	JLabel lb3 = new JLabel("부서위치:");
	JTextField tf3 = new JTextField(10);
	
	JButton bt1 = new JButton("전체 내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름 검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	JTextArea ta = new JTextArea(10, 40);
	public WinEmp() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(bt1); jp1.add(bt2); jp1.add(bt3); 
		jp1.add(bt4); jp1.add(bt5);
		con.add(jp1, BorderLayout.SOUTH);
		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.add(scroll);
		con.add(jp2, BorderLayout.CENTER);
		
		this.setLocation(500, 400);
		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new WinEmp();
	}
}
