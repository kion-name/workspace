package day2;

public class Ex207 {
	public static void main(String[] args) {
		int a1 = 5;

		System.out.println(a1==5 || a1==6);
		//System.out.println(a==5 || 6); // (boolean || int -----) ERR
		
		int c = 5;
		int d = 10;
		System.out.println(c > 2 && d < 15);  // T
		System.out.println(c > 2 || d < 5);   // T

		int x = 10;
		System.out.println(x == 10 || x == 20); // T

		int y = 7;
		System.out.println(y > 5 && y < 10); // T

		int z = 4;
		// System.out.println(z == 4 || 5);  // ERR. (이해)
		System.out.println(z == 4 || z == 5); // T

		int a = 3;
		System.out.println((a == 2 || a == 3) && 4 == 4); //T

		int b = 8;
		System.out.println(b > 5 || (b < 10 && b == 8)); // T
	}
}
