package day1;

public class Ex107 {
	public static void main(String[] args) {
		// 1. int 타입의 변수에 byte 타입의 값을 담기
		byte b = 10;
		int num = b; // 됨
		System.out.println(num);
		// 1바이트 공간에 있는 정보를 4바이트 공간으로 가져다 놓을 수 있음
		// (정보 소실의 우려가 없음 --> 가능)

		// byte 변수에 int 값을 담기
		int num2 = 10;
		// byte b2 = num2; // error
		// 1바이트 공간에 있는 정보를 4바이트 공간으로 가져다 놓을 수 없
		// (정보 소실의 우려가 없음 --> 불가)

	}
}
