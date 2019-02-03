package difficulty1;

import java.util.Scanner;

public class MaxValue2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] numbers = new int[n][10];
		int max;
		
		for (int i = 0; i < n; i++) {
            max = 0;
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = sc.nextInt();
                
				if (max >= numbers[i][j]) {
					continue;

				} else {
					max = numbers[i][j];
				}
			}
            System.out.println("#" + (i + 1) + " " + max);
        }
	}
}
