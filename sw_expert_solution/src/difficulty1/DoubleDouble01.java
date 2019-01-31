package difficulty1;

import java.util.Scanner;

public class DoubleDouble01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
        int total = 1;
        System.out.print(total + " ");
        
        for(int i=0; i<n; i++) {
            total*=2;
            System.out.print(total + " ");
        }

	}

}
