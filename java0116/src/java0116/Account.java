package java0116;

public class Account {
	private String name;
	private int balance;   // 은행 잔고 (마이너스 통장 아님)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() { 
		return balance;
	}
	public void setBalance(int balance) {
		if (balance > 0) {
			this.balance = balance;
		}
	}
	
	
}
