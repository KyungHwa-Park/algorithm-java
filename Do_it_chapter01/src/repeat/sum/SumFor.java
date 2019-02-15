package repeat.sum;

import java.util.Scanner;

//1,2,...,n의 합을 구합니다.
public class SumFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;		// 합
		
		// for(초기화부분; 제어식; 업데이트부분) { 명령문 }
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합 : " + sum);
	}

}
