package difficulty2;

import java.util.Scanner;

public class WaterBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();
			int w = sc.nextInt();
			int billA = p * w;
			int billB;

			if (w > r) {
				billB = q + (w - r) * s;
			} else {
				billB = q;
			}

			int min = billA;
			if (min > billB)
				min = billB;

			System.out.printf("#%d %d\n", tc, min);
		}

	}

}
