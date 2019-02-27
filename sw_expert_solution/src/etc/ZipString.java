package etc;

import java.util.Scanner;

public class ZipString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)-65]++;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]>1) {
				System.out.printf("%d%c", count[i], (char)(i+65));
			} else if(count[i]==1) {
				System.out.printf("%c", (char)(i+65));
			}
			
		}

	}

}
