package day2;

public class Ex210 {

	public static void main(String[] args) {

		int b = 9;
		
		System.out.println((b%2==0)?"짝수":"홀수");
		
		char ch = (b%2==0?'짝':'홀');
		System.out.println(ch+"수");
		
		int num = 15;
		String type = (num % 2 != 0) ? "홀수" : "짝수";
		System.out.println("숫자 " + num + "은 " + type + "입니다."); // 15 홀수

		int a = 10;
		String result = (a > 5) ? "크다" : "작다";
		System.out.println(result); // 크다

		int number = -3; // 0이 아니라고 가정(약속)함.
		String sign = (number >= 0) ? "양수" : "음수";
		System.out.println("입력된 값은 " + sign + "입니다."); // 음수

		int x = 4;
		int y = 7;
		int result1 = (x > y) ? x * 2 : y * 2;
		System.out.println(result1); // 14

		char letter = 'G';
		String caseType = (letter >= 'A' && letter <= 'Z') ? "대문자" : "소문자";
		System.out.println("문자는 " + caseType + "입니다."); // 대문자
		
	}
}
