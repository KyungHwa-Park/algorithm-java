package array.reverse.exercise;

import java.util.Random;

// Q3. 배열의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
public class SumOfArray {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = 1 + rand.nextInt(10);		// 1~10의 난수
		
		int[] arr = new int[num];			// 난수개의 요소를 가지는 배열 생성
		System.out.print("배열 arr =");
		for(int i=0; i<arr.length; i++) {	// 배열에 요소 값 대입
			arr[i] = rand.nextInt(100);
			System.out.print(" " + arr[i]);
		}
		
		// 배열 요소의 합계를 구하는 메서드 호출해 합계 출력
		System.out.println("\n배열 arr 요소의 합계 : " + sumOf(arr));
	}
	
	
	// 배열 arr의 모든 요소의 합계를 구하여 반환하는 메서드
	static int sumOf(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
