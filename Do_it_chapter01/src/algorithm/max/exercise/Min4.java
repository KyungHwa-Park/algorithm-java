package algorithm.max.exercise;

import java.util.Scanner;

// Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
public class Min4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("a : "); 
		int a = sc.nextInt();
		System.out.println("b : "); 
		int b = sc.nextInt();
		System.out.println("c : "); 
		int c = sc.nextInt();
		System.out.println("d : "); 
		int d = sc.nextInt();
		
		int min = min4(a, b, c, d);
		System.out.println("(" + a + "," + b + "," + c + "," + d + ") "
				+ "의 최솟값 : " + min + "입니다.");

	}

	public static int min4(int num1, int num2, int num3, int num4) {
		int min = num1;
		if(min > num2) min = num2;
		if(min > num3) min = num3;
		if(min > num4) min = num4;
		
		return min;
	}
}
