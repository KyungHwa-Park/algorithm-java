package linear.linear_search;

import java.util.Scanner;

// 선형 검색 (while문 사용)
public class SeqSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수(길이) : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		for(int i=0; i<x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}

	}
	
	
	// 요솟수(길이)가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		// 방법 1. 무한루프
		while(true) {
			if(i==n) {
				return -1;		// 검색 실패! (-1을 반환)
			}
			if(a[i] == key) {
				return i;		// 검색 성공! (해당 인덱스를 반환)
			}
			i++;
		}
		
		// 방법 2. n회 루프
//		while(i<n) {
//			if(a[i]==key) {
//				return i;		// 검색 성공!
//			}
//			i++;
//		}
//		return -1;				// 검색 실패!
	}
}
