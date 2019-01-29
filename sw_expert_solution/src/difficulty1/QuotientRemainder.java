package difficulty1;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int mok = a / b;
			int nmg = a % b;

			System.out.println("#" + (i+1) + " " + mok + " " + nmg);
		}

	}

}
