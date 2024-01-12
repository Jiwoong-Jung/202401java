package sec04.exam03;

//Quiz: 아래의 메소드들은 어떤 일을 하나요? (어떤 값을 다루고 있나요?)
// 메소드가 하는 일은 무엇일까?
public class Car {
	int gas;
	
	void setGas(int gas) { // gas에 값을 준다
		this.gas = gas;
	}
	
	boolean isLeftGas() {  // gas가 0인지 아닌지
		if(gas==0) {
			System.out.println("gas가 없습니다."); 
			return false;  // 메소드를 빠져나감. 아래의 코드를 실행안함.
		} 
		System.out.println("gas가 있습니다."); 
		return true;
	}
	
	
	void run() { // gas가 떨어질 때까지 소진
		while(true) {
			if(gas > 0) {
				System.out.println("gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("gas잔량:" + gas + ")");
				return; // 메소드를 빠져나감. 반복문 실행이 끝남.
			}
		}
	}
}

