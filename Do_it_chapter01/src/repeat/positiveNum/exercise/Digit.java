package repeat.positiveNum.exercise;

import java.util.Scanner;

// Q11. 양의 정수를 입력하고 그 자릿수를 출력하는 프로그램을 작성하세요.
public class Digit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("양의 정수를 입력하세요.");
			n = sc.nextInt();
		} while(n <= 0);
		
		
		int digitNum = 0;	// 자릿수를 담을 변수
		
		// n이 몇자리 정수인지 모르기 때문에 루프 횟수 지정 불가. 따라서 for문이 아닌 while문 사용.
		while(n > 0) {
			n /= 10;
			digitNum++;
		}
		
		System.out.println("이 수는 " + digitNum + "자리 정수입니다.");
		

	}

}
