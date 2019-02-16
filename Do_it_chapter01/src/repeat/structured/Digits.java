package repeat.structured;

import java.util.Scanner;

// 2자리의 양수(10~99)를 입력합니다.
public class Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리의 양수를 입력하세요.");
		int no;	
		do {
			System.out.println("입력 : ");
			no = sc.nextInt();
		} while (no<10 || no>99);
		
		System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
	}

}
