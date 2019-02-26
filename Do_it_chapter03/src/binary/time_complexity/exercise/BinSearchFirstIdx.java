package binary.time_complexity.exercise;

/*
 * Q5. 우리가 살펴본 이진 검색 알고리즘 프로그램은 검색할 값과 같은 값을 갖는 요소가 하나 이상일 경우
 * 그 요소 중에서 맨 앞의 요소를 찾지 못합니다. 맨 앞의 요소를 찾는 binSearchX 메서드를 작성하세요.
 */
public class BinSearchFirstIdx {

	public static void main(String[] args) {
		// 이진 검색을 위한 오름차순으로 정렬된 배열
		int[] a = {1,3,5,7,7,7,7,8,8,9,9};
		int n = a.length;
		
		// 찾고자 하는 값 key
		int key = 7;
		
		// 배열의 요소 중 key값과 일치하는 맨 앞의 요소 찾는 메서드 호출
 		int idx = binSearchX(a, n, key);
		if(idx==-1) {
			System.out.println("찾고자 하는 값과 일치하는 요소가 없습니다.");
		} else { 
			System.out.println("찾고자 하는 값 key는 a[" + idx + "]에 있습니다.");
		}	
	}
	
	
	// 배열의 요소 중 key값과 일치하는 맨 앞의 요소 찾는 메서드
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		do {
			int pc = (pl+pr)/2;
			
			if(a[pc]==key) {
				// 방법 1. 내 idea
//				while(a[pc]==key) {		// key와 같은 요소 중 맨 앞의 요소 찾기
//					--pc;
//				}
//				return pc+1;
				
				// 방법 2.
				for (; pc > pl; pc--)	// key와 같은 요소 중 맨 앞의 요소 찾기
					if (a[pc - 1] < key) {
						break;
					}
				return pc;
				
			} else if(a[pc]<key) {
				pl = pc+1;
			} else {
				pr = pc-1;
			}
		} while(pl <= pr);
		return -1;
	}
}
