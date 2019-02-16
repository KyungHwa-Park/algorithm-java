package repeat.positiveNum.exercise;

import java.util.Scanner;

// Q10. 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요. (단, b > a)
public class BsubtractA_sol01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("a의 값 : ");
		a = sc.nextInt();
		
		do {
			System.out.println("b의 값 : ");
			b = sc.nextInt();
			if(a >= b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while (a >= b);
		
		System.out.println("(b - a)는 " + (b-a) + "입니다.");
		
	}

}
