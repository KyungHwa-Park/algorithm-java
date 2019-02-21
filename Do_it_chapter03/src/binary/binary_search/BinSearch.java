package binary.binary_search;

import java.util.Scanner;

// 이진 검색 (binary search)
public class BinSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수(길이) : ");
		int num = sc.nextInt();		
		
		int[] x = new int[num];			// 길이가 num인 배열 생성
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");	// 첫 요소 입력
		x[0] = sc.nextInt();
		
		for(int i=1; i<x.length; i++) {
			// 오름차순으로 입력받기 위해 바로 앞의 요소값봐 작으면 다시 입력받음
			do {
				System.out.printf("x[%d] : ", i);
				x[i] = sc.nextInt();
			} while(x[i-1]>x[i]);
		}
		
		System.out.print("검색할 값 : ");		// 키 값을 입력
		int key = sc.nextInt();
		
		// 길이가 num인 배열 x에서 키 값이 key인 요소 검색
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
	
	
	// 요솟수(길이)가 n인 배열 arr에서 key와 같은 요소를 이진 검색하는 메서드
	static int binSearch(int[] arr, int n, int key) {
		int pl = 0;		// 검색 범위의 첫 인덱스
		int pr = n-1;	// 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2;		// 중앙 요소의 인덱스
			if(arr[pc] == key) {
				return pc;			// 검색 성공!
			} else if(arr[pc] < key) {
				pl = pc+1;			// 검색 범위를 뒤쪽 절반으로 좁힘
			} else {
				pr = pc-1;			// 검색 범위를 앞쪽 절반으로 좁힘
			}
		} while(pl<=pr);
		
		return -1;			// 검색 실패!
	}
}
