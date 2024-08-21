package day2;

import java.util.Scanner; // "import문"

// 스캐너 객체 생성
// Scanner sc = new Scanner(System.in);
// 스캐너 객체를 사용해서 정수값 하나 입력
// sc.nextInt();

public class Ex208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 객체 생성 --> ctrl+shift+o
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("입력받은 값 : " + num);
		
	}
}
