package difficulty2;

import java.util.Scanner;

public class Mode02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        int[] score;
		int[] mode;
		int max;
		int maxIdx;

		for (int tc =1; tc <= T; tc++) {
            tc = sc.nextInt();
			score = new int[1000];
            mode = new int[101];
            
			for(int i=0; i<score.length; i++) {
                score[i] = sc.nextInt();
                mode[score[i]]++;
            }
            
			max = mode[0];
			maxIdx = 0;
			for (int j = 0; j < mode.length; j++) {
				if (mode[j] >= max) {
					max = mode[j];
					maxIdx = j;
				}
			}    
			System.out.printf("#%d %d\n", tc, maxIdx);
		} 
	}

}
