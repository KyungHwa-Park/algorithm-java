package chap01.exercise;

import java.util.Scanner;

// chapter 01. 연습문제 2번 : 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
public class Chap01_Q02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("세 정수의 최솟값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = scanner.nextInt();
		System.out.print("b의 값 : ");
		int b = scanner.nextInt();
		System.out.print("c의 값 : ");
		int c = scanner.nextInt();
		
		int min = min3(a, b, c);
		System.out.println("최솟값 : " + min);
	}
	
	// 세 값의 최솟값을 구하는 메서드 min3
	static int min3 (int a, int b, int c) {
		int min = a;
		
		if (min > b) min = b;
		if (min > c) min = c;
		
		return min;
	}
}
