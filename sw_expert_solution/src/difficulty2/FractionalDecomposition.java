package difficulty2;

import java.util.Scanner;

public class FractionalDecomposition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 소수(prime number) 배열
		int[] prime = { 2, 3, 5, 7, 11 };
		
		// 테스트 케이스 총 갯수를 입력받음
		int T = sc.nextInt();

		// 테스트 케이스 별 소인수분해 시작
		for (int tc = 1; tc <= T; tc++) {
			int[] de = new int[5];
			int num = sc.nextInt();
			while (num > 1) {
				for (int i = 0; i < prime.length; i++) {
					while (num % prime[i] == 0) {
						de[i]++;
						num /= prime[i];
					}
				}
			}
			
			// 소인수분해 결과 출력
			System.out.print("#" + tc);
			for (int i = 0; i < de.length; i++) {
				System.out.print(" " + de[i]);
			}
			System.out.println();
		}

	}

}
