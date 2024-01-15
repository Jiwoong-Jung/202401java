package com.array;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Acc implements Serializable {
	int x;
	String y;
	
	@Override
	public String toString() {
		return "Acc [x=" + x + ", y=" + y + "]";
	}
}
public class ObjEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Acc acc = new Acc();
		acc.x = 100;
		acc.y = "가나다";
		System.out.println(acc);
		FileOutputStream fos = new FileOutputStream("c:/temp/acc.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(acc);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("c:/temp/acc.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Acc acc2 = (Acc) ois.readObject();
		System.out.println(acc2);
		ois.close();
	}

}








