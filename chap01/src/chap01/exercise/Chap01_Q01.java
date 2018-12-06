package chap01.exercise;

import java.util.Scanner;

// chapter 01. 연습문제 1번 : 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
public class Chap01_Q01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("네 개의 숫자 중 최댓값을 구합니다.");
		System.out.print("첫 번째 숫자 : ");
		int a = scanner.nextInt();
		System.out.print("두 번째 숫자 : ");
		int b = scanner.nextInt();
		System.out.print("세 번째 숫자 : ");
		int c = scanner.nextInt();
		System.out.print("네 번째 숫자 : ");
		int d = scanner.nextInt();
		
		int max = max4(a, b, c, d);
		
		System.out.println("최댓값 : " + max);

	}
	
	// 네 값의 최댓값을 구하는 메서드 max4
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (max < b) max = b;
		if (max < c) max = c;
		if (max < d) max = d;
		
		return max;		
	}

}
