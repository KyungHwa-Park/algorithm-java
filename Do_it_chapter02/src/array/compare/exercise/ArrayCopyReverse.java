package array.compare.exercise;

import java.util.Random;
import java.util.Scanner;

//Q5. 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드를 작성하세요.
public class ArrayCopyReverse {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 배열 a, b의 길이를 입력받음
		System.out.println("배열 a의 길이 : ");
		int numA = sc.nextInt();
		System.out.println("배열 b의 길이 : ");
		int numB = sc.nextInt();
		
		// 입력받은 길이 대로 배열 생성
		int[] a = new int[numA];
		int[] b = new int[numB];
		
		// 1~50 사이의 난수로 배열 b의 요소 값 초기화
		for(int i=0; i<b.length; i++) {
			b[i] = 1 + rand.nextInt(50);
		}
		
		// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 호출
		rCopy(a,b);
		
		// 배열 a, b 출력
		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사했습니다.");
		System.out.print("배열 a :");
		for(int i=0; i<a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.print("\n배열 b :");
		for(int i=0; i<b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
	
	
	// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드
	static void rCopy(int[] a, int[] b) {
		int length = a.length>=b.length ? b.length : a.length;
		for(int i=0; i<length; i++) {
			a[i] = b[b.length-1-i];
		}
	}
}
