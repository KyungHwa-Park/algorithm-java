package algorithm.max.exercise;

import java.util.Scanner;

// Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
public class Min3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("a : "); 
		int a = sc.nextInt();
		System.out.println("b : "); 
		int b = sc.nextInt();
		System.out.println("c : "); 
		int c = sc.nextInt();
		
		int min = min3(a, b, c);
		System.out.println("(" + a + "," + b + "," + c + ") "
				+ "의 최솟값 : " + min + "입니다.");

	}
	
	public static int min3(int num1, int num2, int num3) {
		int min = num1;
		if(min > num2) min = num2;
		if(min > num3) min = num3;
		
		return min;
	}

}
