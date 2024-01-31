package exem;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing2 extends JFrame{
	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("버튼2");
	Connection conn;
	Statement stmt;
	public Swing2() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url,id,pass);
				stmt = conn.createStatement();	
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jb1);
		con.add(jb2);
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);

		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ResultSet rs;
			
					try {
						rs = stmt.executeQuery("select * from dept");
						while(rs.next()) {
							System.out.print(rs.getInt("deptno"));
							System.out.print(rs.getString("dname"));
							System.out.println(rs.getString("loc"));
						}

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("jb2");
				
			}
		});
	}
	

	public static void main(String[] args) {
		new Swing2();

	}


}
