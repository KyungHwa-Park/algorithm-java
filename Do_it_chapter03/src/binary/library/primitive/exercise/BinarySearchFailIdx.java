package binary.library.primitive.exercise;

import java.util.Scanner;
import java.util.Arrays;

// Q6. binarySearch 메서드를 활용, 검색에 실패하면 삽입포인트를 출력하는 프로그램을 작성하세요.
public class BinarySearchFailIdx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("arr[0] : ");
		arr[0] = sc.nextInt();
		
		for(int i=1; i<arr.length; i++) {
			do {
				System.out.printf("arr[%d] : ", i);
				arr[i] = sc.nextInt();
			} while(arr[i-1] > arr[i]);
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(arr, key);
		
		if(idx < 0) {
			System.out.println("찾고자 하는 값이 없습니다.");
			System.out.println(key + "의 삽입 포인트는 arr[" + (-idx-1) + "]입니다.");
		} else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
	}

}
