package etc;

import java.util.Scanner;

public class PrintingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		for(int i=1; i<=num; i++) {
			a += i;
			int b=a;
			for(int j=i; j<=num; j++) {
				System.out.printf("%2d ", b);
				b+=j;
			}			
			System.out.println();			
		}

	}
}
