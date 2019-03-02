package difficulty2;

import java.util.Scanner;

public class CountingSheeps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스의 총 갯수를 입력받음
		int T = sc.nextInt();
		
		// 테스트 케이스 하나씩 처리
		for (int tc = 1; tc <= T; tc++) {
			// 초기 양떼 값
			int N = sc.nextInt();
			int k = 0;
			int[] count = new int[10];

			while (true) {
				k++;
				int num = N * k;
				// 0~9 배열 count에 num의 각 자리 넣기
				while (num > 0) {
					int digit = num % 10;
					count[digit]++;
					num /= 10;
				}

				int i = 0;
				for (; i < count.length; i++) {
					
					if (count[i] != 0) {// count 배열의 요소 값이 0이 아니면 배열 탐색	지속
						continue;
					} else {			// count 배열의 요소 값이 0이면 반복문을 빠져나옴
						break;
					}
				}
				// 배열 전체를 탐색한 경우에는 무한루프에서 벗어남
				if (i == count.length) {
					break;
				}
			}
			// 출력
			System.out.printf("#%d %d\n", tc, N * k);
		}

	}

}
