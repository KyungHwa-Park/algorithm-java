package chap01.exercise;

import java.util.Scanner;

// chapter 01. 연습문제 3번 : 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
public class Chap01_Q03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("네 정수의 최솟값을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = scanner.nextInt();
		System.out.print("b의 값 : ");
		int b = scanner.nextInt();
		System.out.print("c의 값 : ");
		int c = scanner.nextInt();
		System.out.print("d의 값 : ");
		int d =  scanner.nextInt();
		
		int min = min4(a, b, c, d);
		
		System.out.println("최솟값 : " + min);
	}

	// 네 값의 최솟값을 구하는 메서드 min4
	static int min4 (int a, int b, int c, int d) {
		int min = a;
		
		if (min > b) min = b;
		if (min > c) min = c;
		if (min > d) min = d;
		
		return min;
	}
}
