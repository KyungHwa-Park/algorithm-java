package difficulty1;

import java.util.Scanner;

public class ChangingCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		// 대문자 변환
		System.out.println(line.toUpperCase());
		// 소문자 변환
		System.out.println(line.toLowerCase());
		
	}

}
