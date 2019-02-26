package binary.library.primitive;

import java.util.Arrays;
import java.util.Scanner;

// Array.binarySearch로 이진 검색
public class BinarySearchTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		for(int i=1; i<x.length; i++) {
			do {
				System.out.printf("x[%d] : ", i);
				x[i] = sc.nextInt();
			} while(x[i-1]>x[i]);
		}
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		// 배열 x에서 값이 key인 요소 겁색하는 라이브러리
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0) {
			System.out.println("찾고자 하는 값이 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
	}

}
