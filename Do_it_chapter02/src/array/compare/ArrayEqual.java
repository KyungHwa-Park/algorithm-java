package array.compare;

import java.util.Scanner;

// 두 배열이 같은가를 판단
public class ArrayEqual {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int numA = sc.nextInt();

		int[] a = new int[numA];
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d] : ", i);
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int numB = sc.nextInt();

		int[] b = new int[numB];
		for(int i=0; i<b.length; i++) {
			System.out.printf("a[%d] : ", i);
			b[i] = sc.nextInt();
		}
		
//		System.out.print("배열 a와 b는 ");
//		if(equals(a,b)==true) {
//			System.out.println("같습니다.");
//		} else {
//			System.out.println("같지 않습니다.");
//		}
		
		// 삼항 연산자를 사용하여 출력
		System.out.println("배열 a와 b는 " + 
				(equals(a,b) ? "같습니다." : "같지 않습니다."));
	}
	
	
	// 두 배열 a, b의 모든 요소가 같은가?
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {		// 두 배열 a,b의 길이 비교
			return false;
		}
		for(int i=0; i<a.length; i++) {	// 두 배열 a,b의 요소 값 비교
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

}
