package difficulty1;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1~9999까지의 자연수 n
		int n;
        do {
             n = sc.nextInt();
        } while (n<1 || n>9999);

        // 각 자릿수 더하기
        int digitSum = 0;
        while(n>0) {
            digitSum += n%10;
            n /= 10;
        }
        
        // 자릿수의 합 출력
        System.out.println(digitSum);

	}

}
