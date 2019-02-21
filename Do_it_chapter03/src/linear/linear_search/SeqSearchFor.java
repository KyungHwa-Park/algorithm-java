package linear.linear_search;

import java.util.Scanner;

// 선형 검색 (for문 사용)
public class SeqSearchFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수(길이) : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		for(int i=0; i<x.length; i++) {
			System.out.printf("x[%d] : ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);
		if(idx == -1) {
			System.out.println("찾고자 하는 값이 존재하지 않습니다.");
		} else {
			System.out.printf("%d는(은) x[%d]에 있습니다.", key, idx);
		}
	}
	
	
	// 배열 a의 앞쪽 n개의 요소에서 key와 같은 요소를 선형 검색
	static int seqSearch(int[] arr, int num, int key) {
		for(int i=0; i<num; i++) {
			if(arr[i] != key) {
				continue;
			} else {		// 검색 성공! (인덱스를 반환)
				return i;
			}
		}
		return -1;			// 검색 실패 (-1을 반환)
		
		// 더 간단히
//		for(int i=0; i<num; i++) {
//			if(arr[i] == key) {
//				return i;	// 검색 성공! (인덱스를 반환)
//			}
//		}
//		return -1;			// 검색 실패 (-1을 반환)
	}
}
