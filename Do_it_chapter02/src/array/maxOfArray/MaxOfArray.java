package array.maxOfArray;

import java.util.Scanner;

// 배열 요소의 최댓값을 나타냅니다. (값을 입력받음)
public class MaxOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();			// 배열의 요솟수를 입력받음
		
		int[] height = new int[num];	// 요솟수가 num개인 배열 생성
		
		for(int i=0; i<num; i++) {		// 배열의 구성 요소 값을 입력받음
			System.out.printf("height[%d] : ", i);;
			height[i] = sc.nextInt();
		}
		
		// 배열의 최댓값을 구하는 메서드 호출
		int max = maxOf(height);
		// 최댓값 출력
		System.out.println("최댓값은 " + max + "입니다.");

	}
	
	
	// 매개변수로 받은 배열 arr의 최댓값을 구하여 반환(return)하는 메서드
	static int maxOf(int[] arr) {
		int max = arr[0];
		
		// 배열을 스캐닝하면서 최댓값 구하기
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
