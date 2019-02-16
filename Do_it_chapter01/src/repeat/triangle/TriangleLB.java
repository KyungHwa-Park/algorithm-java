package repeat.triangle;

import java.util.Scanner;

// 왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.
public class TriangleLB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		// 이등변 삼각형의 단 수를 입력받음
		int n;
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = sc.nextInt();
		} while (n<=0);
		
		// 직각 이등변 삼각형 출력
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
