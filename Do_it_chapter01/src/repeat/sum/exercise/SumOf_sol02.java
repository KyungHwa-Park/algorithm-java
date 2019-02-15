package repeat.sum.exercise;

import java.util.Scanner;

public class SumOf_sol02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		System.out.println();
		int sum = sumOf(a, b);
		System.out.println("a, b를 포함하여 그 사이의 모든 정수를 더한 값 : " + sum);

	}
	
	static int sumOf(int a, int b) {
		int min;
		int max;
		if(a>b) {		// a > b
			min = b;
			max = a;
		} else {		// a <= b
			min = a;
			max = b;
		}
		
		int sum = 0;
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		return sum;
	}

}
