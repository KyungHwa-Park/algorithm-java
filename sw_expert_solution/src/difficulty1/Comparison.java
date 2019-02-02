package difficulty1;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i<=n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("#" + i + " ");
            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }

	}

}
