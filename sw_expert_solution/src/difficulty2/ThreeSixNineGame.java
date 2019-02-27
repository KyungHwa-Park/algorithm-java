package difficulty2;

import java.util.Scanner;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int count=0;
			int q=i;
			int r;
			
			while(q>0) {
				r=q%10;
				if (r == 3 || r == 6 || r == 9) {
					count++;
				}
				q/=10;
			}
			if(count>0) {
				for(int j=0; j<count; j++) {
					System.out.print("짝");
				}
				System.out.print(" ");
			} else {
				System.out.print(i + " ");
			}
				
		}
	}
}
