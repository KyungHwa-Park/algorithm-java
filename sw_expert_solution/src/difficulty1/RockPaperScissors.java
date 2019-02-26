package difficulty1;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1 : 가위, 2 : 바위, 3 : 보 (비기는 경우는 없음)
        if(a==1&&b==3 || a==2&&b==1 || a==3&&b==2) {
        	System.out.println("A");
        } else if(b==1&&a==3 || b==2&&a==1 || b==3&&a==2) {
        	System.out.println("B");
        }
	}
}
