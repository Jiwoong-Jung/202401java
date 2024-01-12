package com.project;

public class Session {
	private boolean run;
	private boolean run2;
	LoginInfo loginInfo;
	
	public Session(boolean run, boolean run2, LoginInfo loginInfo) {
		super();
		this.run = run;
		this.run2 = run2;
		this.loginInfo = loginInfo;
	}

	public Session(boolean run, boolean run2) {
		super();
		this.run = run;
		this.run2 = run2;
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}
	
	
	
}
