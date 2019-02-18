package array.reverse;

import java.util.Scanner;

// 배열 요소의 값을 읽어 들여 역순으로 정렬합니다.
public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int x[] = new int[num];		// 요솟수가 num개인 배열 생성
		
		for(int i=0; i<num; i++) {	// 배열에 요소 값을 입력받음
			System.out.printf("x[%d] : ", i);
			x[i] = sc.nextInt();
		}
		
		reverse(x);		// 배열의 요소를 역순으로 정렬하는 메서드 호출
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<x.length; i++) {
			System.out.printf("x[%d] : ", i);
			System.out.println(x[i]);
		}
		
	}
	
	// 메서드 2개 사용 (swap용, 역순 정렬용)
	// 1. 배열 요소 arr[idx1]과 arr[idx2]의 값을 바꿈
	static void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
				
	}
	// 2. 배열 arr의 요소를 역순으로 정렬
	static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			swap(arr, i, arr.length-1-i);
		}
	}
}
