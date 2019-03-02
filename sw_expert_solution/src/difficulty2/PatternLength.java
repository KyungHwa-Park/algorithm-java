package difficulty2;

import java.util.Scanner;

public class PatternLength {

	// 문제에서 주어진 패턴 마디의 최대 길이를 상수로 정의
	static final int MAXL = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 총 테스트 케이스 갯수를 입력받음
		int T = sc.nextInt();

		// 테스트 케이스 하나씩 반복 실행
		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int i = 1;
			int j = 1;

			// 입력받은 문자열 str의 첫 글자(idx 0)를 기준으로 idx 1부터 패턴 마디의 최대길이까지 반복하면서 패턴 찾기
			for (; i < MAXL; i++) {
				if (str.charAt(0) != str.charAt(i)) {
					continue;
				} else { // 첫 글자와 같은 글자 발견 시
					// 패턴이 맞는지 확인
					for (; j < i; j++) {
						if (str.charAt(j) != str.charAt(i + j)) { // 패턴 아님
							break;
						}
					}
					if (j == i) { // 패턴 발견!
						break;
					}
				}
			}
			// 패턴의 길이 출력
			System.out.printf("#%d %d\n", tc, i);
		}

	}

}
