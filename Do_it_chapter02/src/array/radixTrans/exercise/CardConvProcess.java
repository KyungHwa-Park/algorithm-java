package array.radixTrans.exercise;

import java.util.Scanner;

// Q7. 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요.
public class CardConvProcess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no; // 변환하고자 하는 음이 아닌 정수
		int cd; // 변환 할 기수(진수)
		int dno; // 변환 후의 자릿수
		int retry; // 다시 한 번 할 지 여부 저장
		char[] cno = new char[32]; // 기수 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
			} while (no < 0);

			do {
				System.out.print("어떤 진수로 변환할까요? (2~36): ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);

			// 정수 no를 cd진수로 변환하는 메서드 호출
			dno = cardConvP(no, cd, cno);

			System.out.printf("%d진수로는 ", cd);
			for (int i = 0; i < dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println(" 입니다.");

			System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
			retry = sc.nextInt();

			if (retry == 0) {
				System.out.println("기수 변환을 종료합니다.");
			}
		} while (retry == 1);

	}

	// 기수 변환 과정을 자세히 나타내는(출력하는) 메서드 정의
	static int cardConvP(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.printf("%3d |	%6d\n", r, x);
		do {
			System.out.println("    +------------------");
			d[digits++] = dchar.charAt(x % r);
			if (x / r != 0) {
				System.out.printf("%3d |	%6d   ... %c\n", r, x / r, d[digits - 1]);
			} else {
				System.out.printf(" 	%6d   ... %c\n", x / r, d[digits - 1]);
			}
			x /= r;

		} while (x != 0);

//		while (x != 0) {
//			System.out.println("    +----------");
//			d[digits++] = dchar.charAt(x % r);
//			if (x / r != 0) {
//				System.out.printf("%3d |	%6d   ... %c\n", r, x / r, d[digits - 1]);
//			} else {
//				System.out.printf(" 	%6d   ... %c\n", x / r, d[digits - 1]);
//			}
//			x /= r;
//		}

		for (int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - 1 - i];
			d[digits - 1 - i] = temp;
		}

		return digits;
	}

}
