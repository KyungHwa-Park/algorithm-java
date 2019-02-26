package difficulty1;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			str.charAt(i);
			System.out.print((i+1) + " ");
		}
		
		
//		char[] alphabet = new char[26];
//		char a = 65;
//		for(int i=0; i<alphabet.length; i++, a++) {
//			alphabet[i] = a;
//		}
	}
}
