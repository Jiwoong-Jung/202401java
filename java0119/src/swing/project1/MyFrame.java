package swing.project1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	List<Account> list = new ArrayList<>();
	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("입력");
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jt5 = new JTextField();
	JTextField jt6 = new JTextField();
	JLabel lb7 = new JLabel("메시지: 나오나요? 상태 메시지!");
	JTextArea ta = new JTextArea();
	public MyFrame() {
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		Container con = this.getContentPane();
		con.setLayout(null);
		
		con.add(lb7);
		lb7.setLocation(20, 420);
		lb7.setSize(400, 30);
		
		JLabel lb1 = new JLabel("이름");
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);
		
		
		con.add(jt1);
		jt1.setLocation(50, 50);
		jt1.setSize(100, 30);
		
		JLabel lb2 = new JLabel("아이디");
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);
		
		
		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);
		
		JLabel lb3 = new JLabel("패스워드");
		con.add(lb3);
		lb3.setLocation(400, 50);
		lb3.setSize(100, 30);
		
		
		con.add(jt3);
		jt3.setLocation(460, 50);
		jt3.setSize(100, 30);
		
		JLabel lb4 = new JLabel("생년월일");
		con.add(lb4);
		lb4.setLocation(620, 50);
		lb4.setSize(100, 30);
		
		
		con.add(jt4);
		jt4.setLocation(680, 50);
		jt4.setSize(100, 30);
		
		JLabel lb5 = new JLabel("전화");
		con.add(lb5);
		lb5.setLocation(20, 80);
		lb5.setSize(100, 30);
		
		
		con.add(jt5);
		jt5.setLocation(50, 80);
		jt5.setSize(100, 30);
		
		JLabel lb6 = new JLabel("잔고");
		con.add(lb6);
		lb6.setLocation(200, 80);
		lb6.setSize(100, 30);
		
		
		con.add(jt6);
		jt6.setLocation(250, 80);
		jt6.setSize(100, 30);
		
		
		jb1.setLocation(20, 350);
		jb1.setSize(100, 30);
		con.add(jb1);
		
		
		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		con.add(jb2);
		
		JButton jb3 = new JButton("조회");
		jb3.setLocation(380, 350);
		jb3.setSize(100, 30);
		con.add(jb3);
		
		JButton jb4 = new JButton("수정");
		jb4.setLocation(560, 350);
		jb4.setSize(100, 30);
		con.add(jb4);
		
		JButton jb5 = new JButton("삭제");
		jb5.setLocation(740, 350);
		jb5.setSize(100, 30);
		con.add(jb5);
		
		JScrollPane scroll = new JScrollPane(ta);
		scroll.setLocation(20, 120);
		scroll.setSize(830, 200);
		con.add(scroll);
//		JTextArea ta = new JTextArea();
//		ta.setLocation(20, 120);
//		ta.setSize(830, 200);
//		con.add(ta);
		
		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true);  // 윈도우 프레임을 보이게
		this.setSize(900, 500);  // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String... ar) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getActionCommand());
		switch (e.getActionCommand()) {
		case "전체내용":
			lb7.setText("전체내용 나오기");
			for (Account acc : list) {
				ta.append(acc.toString());
				ta.append("\n");
			}
			break;
		case "입력":
//			System.out.println("입력 실행");
//			System.out.printf("%s,%s,%s,%s,%s,%s\n",
//					jt1.getText(), jt2.getText(),
//					jt3.getText(), jt4.getText(),
//					jt5.getText(), jt6.getText());
			String name = jt1.getText();
			String id = jt2.getText();
			String pass = jt3.getText();
			String tel = jt4.getText();
			String ssn = jt5.getText();
			int balance = Integer.parseInt(jt6.getText());
			Account acc = 
					new Account(name, id, pass, tel, ssn, balance);
			list.add(acc);
//			String str = String.format("%s,%s,%s,%s,%s,%d",
//					name, id, pass, tel, ssn, balance);
//			lb7.setText(str);
			lb7.setText(acc.toString());
			break;
		default:
			break;
		}
		
	}
}





