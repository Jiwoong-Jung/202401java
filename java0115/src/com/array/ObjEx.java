package com.array;

class Acc {
	int x;
	String y;
	
	@Override
	public String toString() {
		return "Acc [x=" + x + ", y=" + y + "]";
	}
}
public class ObjEx {

	public static void main(String[] args) {
		Acc acc = new Acc();
		acc.x = 100;
		acc.y = "가나다";
		System.out.println(acc);
	}

}
