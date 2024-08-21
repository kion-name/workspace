package day1;

public class Ex106 {
	public static void main(String[] args) {
		final int a = 5;
		//a = 10; // error
		
		// (참고) 자바에서는 상수를 먼저 선언해놓고, 나중에 초기화 할 수도 있음
		final double b;
		
		
		b = 2.0;
		//b = 7.0; // 나중에 초기화는 가능하나 상수이기 때문에 다시 초기화는 에러가 난다.
		
		// 상수의 이름은 대문자로 선언한다.
		final double PI = 3.141592;
		
		
	}

}
