package difficulty2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int i = 0;
			int j = str.length() - 1;
			int result = 1;

			// 입력받은 str의 길이가 짝수(hannah)일 때, 기존의 코드에서 오류 발생 => 수정 완료!
			for (; i < str.length()/2; i++, j--) {
				if (str.charAt(i) != str.charAt(j)) {
					result = 0;
					break;
				}
			}
			System.out.printf("#%d %d\n", tc, result);
		}

	}

}
