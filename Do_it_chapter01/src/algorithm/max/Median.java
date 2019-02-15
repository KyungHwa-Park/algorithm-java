package algorithm.max;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		System.out.println("c : ");
		int c = sc.nextInt();

		System.out.println("(" + a + "," + b + "," + c + ") " 
				+ "의 중앙값 : " + med3(a,b,c) + "입니다.");

	}

	static int med3(int num1, int num2, int num3) {
		if (num1 >= num2) {
			if (num2 >= num3) {
				return num2; // A,B,F,G
			} else if (num1 <= num3) {
				return num1; // D,E,H
			} else {
				return num3; // C
			}
		} else if (num1 > num3) {
			return num1; // I
		} else if (num2 > num3) {
			return num3; // J,K
		} else {
			return num2; // L,M
		}
	}

}
