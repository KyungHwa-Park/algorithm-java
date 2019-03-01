package difficulty2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			String str = sc.next();
			int i = 0;
			int j = str.length()-1;
			
			for(; i<str.length()/2; i++, j--) {
				if(str.charAt(i) != str.charAt(j)) {
					break;
				}
			}
			System.out.print("#" + tc + " ");
			if(i==j) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

	}

}
