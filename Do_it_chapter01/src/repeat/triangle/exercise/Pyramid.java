package repeat.triangle.exercise;

import java.util.Scanner;

// Q16. n단의 피라미드를 출력하는 메서드를 작성하세요.
public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드를 출력합니다.");
		
		// 출력하려는 피라미드 단 수 입력받기
		int n;
		do {
			System.out.print("몇 단 피라미드입니까? : ");
			n = sc.nextInt();
		} while (n<=0);
		
		// 메서드 호출
		spira(n);

	}
	
	// n단 피라미드를 출력하는 메서드
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
