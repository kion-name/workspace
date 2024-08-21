package day2;

public class Ex209 {
	public static void main(String[] args) {
//		int num = 5;
//		num++;
//		System.out.println(num); // 6
//		++num;
//		System.out.println(num); // 7
//		
//		int num2 = num++;
//		System.out.println(num2); // 7
//		
//		int num3 = ++num;
//		System.out.println(num3); // 9
//		System.out.println(num);
//		
//		int num4 = num--; // 9
//		System.out.println(--num4); // 8
		
			int a = 10;
			int b = a++;
			System.out.println("a : " + a);  // 11
			System.out.println("b : " + b);  // 10

			int x = 3;
			int y = ++x;
			System.out.println("x : " + x);  // 4
			System.out.println("y : " + y);  // 4

			int m = 7;
			int n = 7;
			int result1 = m++;
			int result2 = ++n;
			System.out.println("result1 : " + result1); // 7
			System.out.println("result2 : " + result2); // 8

			int a1 = 5;
			a1++;
			++a1;
			System.out.println("a1 : " + a1); // 7
			a1--;
			System.out.println("a1 : " + a1);  // 6

	}
}
