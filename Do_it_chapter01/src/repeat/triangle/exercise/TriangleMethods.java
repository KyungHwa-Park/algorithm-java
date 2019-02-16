package repeat.triangle.exercise;

import java.util.Scanner;

// Q15. 직각 이등변 삼각형을 출력하는 부분을 메서드로 작성하세요.
public class TriangleMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직각 이등변 삼각형을 출력합니다.");
		
		// 단 수 입력받기
		int n;
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = sc.nextInt();
		} while (!(n>0));
		
		// 메서드 호출
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
	}
	
	// 왼쪽 아래가 직각인 이등변 삼각형을 출력하는 메서드
	static void triangleLB (int n) {
		System.out.println("<왼쪽 아래가 직각인 이등변 삼각형>");
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형을 출력하는 메서드
	static void triangleLU (int n) {
		System.out.println("<왼쪽 위가 직각인 이등변 삼각형>");
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형을 출력하는 메서드
	static void triangleRU (int n) {
		System.out.println("<오른쪽 위가 직각인 이등변 삼각형>");
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형을 출력하는 메서드
	static void triangleRB (int n) {
		System.out.println("<오른쪽 아래가 직각인 이등변 삼각형>");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
