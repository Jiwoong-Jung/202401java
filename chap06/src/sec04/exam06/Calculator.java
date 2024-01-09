package sec04.exam06;

public class Calculator {
	
	double areaRect(double width) {
		return width * width;
	}
	
	double areaRect(double width, double height) {
		return width * height;
	}
	
	public static void main(String[] ar) {
		Calculator cal = new Calculator();
		System.out.println(cal.areaRect(11.5));
		System.out.println(cal.areaRect(11.5, 5.9));
	}
}
