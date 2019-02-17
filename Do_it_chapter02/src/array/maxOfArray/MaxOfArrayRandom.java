package array.maxOfArray;

import java.util.Random;
import java.util.Scanner;

//배열 요소의 최댓값을 나타냅니다. (값을 난수로 생성)
public class MaxOfArrayRandom {

	public static void main(String[] args) {
		// 난수 생성을 위해 Random 클래스형 변수(rand)를 선언
		Random rand = new Random();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();			// 배열의 요솟수를 입력받음
		
		int[] height = new int[num];	// 요솟수가 num개인 배열 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		for(int i=0; i<num; i++) {
			// 배열 요소의 값을 난수로 결정
			//	=> 변수 rand에 대한 난수를 생성하는 메서드 nextInt() 호출 : 범위 0~n-1(89)
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
