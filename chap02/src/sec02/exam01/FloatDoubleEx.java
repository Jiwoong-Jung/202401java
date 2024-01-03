package sec02.exam01;

public class FloatDoubleEx {

	public static void main(String[] args) {
		double value = 2e-308;
//		float = 1e2f;
		boolean var2 = false;
		char var1 = 65;
		System.out.println(var1);
		
		float num1 = 123.456755684654657635432263f;
        double num2 =123.456755684654657635432263;

        System.out.println("float형  변수 num1 : " + num1);
        System.out.println("double형 변수 num2 : " + num2);

        double var = 0.1;
        for(int i = 0; i < 10; i++) { // 10회 반복
            var += 0.1;
        }

        System.out.println(var);
	}

}
