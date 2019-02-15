package repeat.sum.exercise;

import java.util.Scanner;

// Q7. n이 7이면 '1 + 2 + 3 + 4 + 5 + 6 + 7 = 28'로 출력하는 프로그램을 작성하세요.
public class SumForEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		System.out.print("'");
		for(int i=1; i<=n; i++) {
			sum += i;
			
			if(i<n) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
		}
		System.out.println("'");

	}

}
