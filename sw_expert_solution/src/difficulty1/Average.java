package difficulty1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int avg = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				int num = sc.nextInt();
				sum += num;
			}
			if (sum % 10 >= 5) {
				avg = sum / 10 + 1;
			} else {
				avg = sum / 10;
			}
			System.out.println("#" + i + " " + avg);
			sum = 0;
			avg = 0;
		}
	}
}
