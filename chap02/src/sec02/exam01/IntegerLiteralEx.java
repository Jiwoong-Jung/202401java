package sec02.exam01;

public class IntegerLiteralEx {

	public static void main(String[] args) {
		double var13 = 1.8e307;
		System.out.println(var13);
		
		String str = "가\"나\"\\다";
		System.out.println(str);
		
		char var11 = '\uac00';
		int var12 = '각';
		System.out.println(var11);
		System.out.println(var12);
		
		long var9 = 2150000000L;
//		int var10 = 2150000000;
		
		byte var1 = -128;
//		byte var2 = -129;
		byte var3 = 127;
//		byte var4 = 128;
		short var5 = -32768;
//		short var6 = -32769;
		
		int var7 = 0B1111111;
		System.out.println(var7);
		int var8 = 0XF;
		System.out.println(var8);
	}

}
