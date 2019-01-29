package difficulty1;

import java.util.Scanner;

public class OddAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				int num = sc.nextInt();
				if (num % 2 != 0) {
					sum += num;
				}
			}
			System.out.println("#" + i + " " + sum);
			sum = 0;
		}
	}
}
