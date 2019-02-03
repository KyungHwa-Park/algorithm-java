package difficulty1;

import java.util.Scanner;

public class MaxValue1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] numbers = new int[n][10];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = sc.nextInt();
//				System.out.print(numbers[i][j] +" ");
			}
//			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			int max = 0;
			for (int j = 0; j < numbers[i].length; j++) {
				if (max >= numbers[i][j]) {
					continue;

				} else {
					max = numbers[i][j];
//					System.out.print(max + " ");
				}
			}
//			System.out.println();
			System.out.println("#" + (i + 1) + " " + max);
		}
	}

}
