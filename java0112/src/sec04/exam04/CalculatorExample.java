package sec04.exam04;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.execute(); // 외부 호출
		//myCalc.plus(0, 0); // 외부 호출
		Calculator myCalc1 = new Calculator();
		
		Calculator myCalc2 = new Calculator();
	}
}

