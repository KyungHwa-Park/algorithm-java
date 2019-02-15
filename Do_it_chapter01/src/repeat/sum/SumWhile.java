package repeat.sum;

import java.util.Scanner;

// 1,2,...,n의 합을 구합니다.
public class SumWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;		// 합
		
		// while(제어식) { 명령문 }
		while(i<=n) {		// i가 n 이하면 반복
			sum += i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

}
