package repeat.sum.exercise;

import java.util.Scanner;

// Q6. while문이 종료될 때 변수 i의 값이 n+1이 됨을 확인하세요.
public class SumWhilePrintingLastNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		System.out.println("마지막으로 더한 값 : " + n);
		System.out.println("변수 i의 최종값 : " + i);
	}

}
