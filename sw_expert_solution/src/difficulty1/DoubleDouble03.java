package difficulty1;

import java.util.Scanner;

public class DoubleDouble03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
        int total = 1;
        int i = 0;
        
        do {
            System.out.print(total + " ");
            total *= 2;
            i++;
        } while (i<=n);

	}

}
