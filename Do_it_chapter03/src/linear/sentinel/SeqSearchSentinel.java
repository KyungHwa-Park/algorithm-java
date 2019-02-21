package linear.sentinel;

import java.util.Scanner;

// 선형 검색 (보초법)
public class SeqSearchSentinel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수(길이) : ");
		int num = sc.nextInt();
		
		int[] x = new int[num+1];		// 요솟수 num에 +1을 해서 보초가 저장될 공간을 만듦
		for(int i=0; i<num; i++) {
			System.out.printf("x[%d] : ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");	
		int key = sc.nextInt();			// 키 값을 입력받음
		
		// 보초법을 사용해서 배열 x에서 값이 key인 요소를 검색하는 메서드 호출
		int idx = seqSearchSen(x, num, key);
		
		if(idx == -1) {
			System.out.println("찾고자 하는 값이 존재하지 않습니다.");
		} else {
			System.out.printf("%d는(은) x[%d]에 있습니다.", key, idx);
		}
	}
	
	
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색하는 메서드
	static int seqSearchSen(int[] arr, int num, int key) {
		int i = 0;
		arr[num] = key;			// 보초를 추가
		while(true) {
			if(arr[i]==key) {	// 검색 성공!
				break;
			}
			i++;
		}
		return i == num ? -1 : i;
	}
}
