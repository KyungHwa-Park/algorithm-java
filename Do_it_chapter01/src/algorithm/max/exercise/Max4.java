package algorithm.max.exercise;

import java.util.Scanner;

// Q1. 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
public class Max4 {

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
		
		int max = max4(a, b, c, d);
		System.out.println("(" + a + "," + b + "," + c + "," + d + ") "
				+ "의 최댓값 : " + max + "입니다.");
		
	}

	public static int max4(int num1, int num2, int num3, int num4) {
		int max = num1;
		if(num2 > max) max = num2;
		if(num3 > max) max = num3;
		if(num4 > max) max = num4;
		
		return max;
	}
}
