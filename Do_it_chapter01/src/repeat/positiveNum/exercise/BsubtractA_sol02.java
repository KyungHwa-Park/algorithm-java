package repeat.positiveNum.exercise;

import java.util.Scanner;

//Q10. 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요. (단, b > a)
public class BsubtractA_sol02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		int b;
		
		// 무한 루프 : b > a인 순간 빠져나옴 (break)
		while(true) {
			System.out.println("b의 값 : ");
			b = sc.nextInt();
			
			if(b>a) {
				break;
			}
			
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		 System.out.println("(b - a)는 " + (b-a) + "입니다.");

	}

}
