package difficulty2;

import java.util.Scanner;

public class ZigzagNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			
			int total = 1;
			for (int i = 2; i <= num; i++) {
				int add = i;
				if (i % 2 == 0) {			
					add *= -1;
				}
				total += add;
			}
			System.out.printf("#%d %d\n", tc, total);
		}

	}

}
