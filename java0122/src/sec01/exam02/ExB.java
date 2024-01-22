package sec01.exam02;

//import sec01.exam02.B.Bb;

public class ExB {

	public static void main(String[] args) {
		B b = new B();
		B.s2 = b.new Ba();
		
		B.s3 = new B.Bb();
				
		B b1 = new B();
		b1.s1 = b1.new Ba();
//		
//		B b1 = new B();
//		b1.s1 = "값";

	}

}
