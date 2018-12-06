package chap01.training;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최대값을 구합니다. (실습 1-1)
public class Max3 {
	
	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdInt.nextInt();
		System.out.print("b의 값 : "); int b = stdInt.nextInt();
		System.out.print("c의 값 : "); int c = stdInt.nextInt();
		
		int max = a;
		if (max < b) max=b;
		if (max < c) max=c;
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
