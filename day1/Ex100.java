package day1;
/*
	글자크기 : [ctrl] + [+/-]
	저장 : [ctrl] + [s]
	한줄삭제 : [ctrl] + [d]
	실행 : [ctrl] + [f11]
	주석 : [ctrl] + [/]
*/
public class Ex100 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println(123);
		System.out.println(3.14);
		
		String s1; // s1이라는 이름을 선언("변수") ---> 문자열을 저장 가능
		s1 = "Hello ";
		String s2;
		s2 = "World";
		System.out.println(s1+s2); // 문자열 + 문자열
		
		System.out.println(5+3);
		System.out.println("5+3");
		
		System.out.println("Java" + " Programming"); // Java Programming
		System.out.println("Hello" + 2024);  // Hello2024
		System.out.println("3 + 4 = " + 3 + 4); // 3 + 4 = 34
		System.out.println("3 + 4 = " + (3 + 4)); // 3+ 4 = 7
		
		String firstName = "John"; 
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName); // John Doe
		System.out.println("Name: " + firstName + " " + lastName); // Name: John Doe
		
		System.out.println(10 + 5);        // 숫자 덧셈 15
		System.out.println("10 + 5");      // 문자열 10 + 5
		System.out.println("10" + 5);      // 문자열과 숫자 결합 105
		
		String message = "Hello Java!";
		System.out.println(message); // Hello Java

		message = "Hello 변수!";
		System.out.println(message); // Hello 변수!

		message = "Hello 문자열!";
		System.out.println(message); // Hello 문자열!

	}

}
