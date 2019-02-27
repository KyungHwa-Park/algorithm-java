package difficulty2;

import java.util.Scanner;

public class Mode01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] mode;
		int score;
		int max;
		int maxIdx;

		for (int tc = 1; tc <= T; tc++) {
			tc = sc.nextInt();
			mode = new int[101];
			for (int j = 0; j < 1000; j++) {
				score = sc.nextInt();
				for (int k = 0; k < mode.length; k++) {
					if (score == k) {
						mode[k]++;
					} else {
						continue;
					}
				}
			}
			max = mode[0];
			maxIdx = 0;
			for (int j = 0; j < mode.length; j++) {
				if (mode[j] >= max) {
					max = mode[j];
					maxIdx = j;
				}
			}
			// for(int j=0; j<mode.length; j++) {
			// System.out.printf("[%d] %d", j, mode[j]);
			// }
			System.out.printf("#%d %d\n", tc, maxIdx);
		}

	}

}
