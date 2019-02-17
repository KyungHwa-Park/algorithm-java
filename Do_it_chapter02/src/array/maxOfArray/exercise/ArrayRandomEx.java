package array.maxOfArray.exercise;

import java.util.Random;

// Q1. 키뿐만 아니라 사람 수도 난수로 생성하도록 프로그램을 작성하세요.
public class ArrayRandomEx {

	public static void main(String[] args) {
		// 난수 생성을 위해 Random 클래스형 변수(rand)를 선언
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		
		// 배열의 요솟수를 1~10 사이의 난수로 결정
		int num = 1 + rand.nextInt(10);
		System.out.println("사람 수 : " + num);
		
		int[] height = new int[num];	// 요솟수가 num개인 배열 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<num; i++) {
			// 배열 요소의 값을 100~189 사이의 난수로 결정
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
	
	
	// 매개변수로 받은 배열 arr의 최댓값을 구하여 반환(return)하는 메서드
	static int maxOf(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
