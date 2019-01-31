package difficulty1;

import java.util.Scanner;

public class DoubleDouble02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
        int total = 1;
       
        for(int i=0; i<=n; i++) {
            System.out.print(total + " ");
            total*=2;
        }

	}

}
