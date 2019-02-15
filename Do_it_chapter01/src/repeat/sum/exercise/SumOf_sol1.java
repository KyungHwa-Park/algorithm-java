package repeat.sum.exercise;

import java.util.Scanner;

// Q9. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 sumOf를 작성하세요.
public class SumOf_sol1 {

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
		int sum = 0;
		if(a<b) {				// a < b 일 때 a에서 b까지 더함
			for(int i=a; i<=b; i++) {
				sum += i;
			}
		} else {			// a >= b 일 때 b에서 a까지 더함
			for(int i=b; i<=a; i++) {
				sum += i;
			}
		} 
		return sum;
		
	}

}
