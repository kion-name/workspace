package day2;
// 산술(+-*/%)+대입 연산자(=) : += -= /= %=
public class Ex205 {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		a += b; // a = a+b;
		System.out.println(a);
		
		a *= b; // a = a*b;
		System.out.println(a);
		
		b /= 10; // b = b/10;
		System.out.println(b);
	}
}
