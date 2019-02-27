package etc;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] prize = new int[T];
		int maxMoney = prize[0];
		
		for(int tc=0; tc<T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int money=0;
			
			if(a==b && a==c && b==c) {
				money = 10000 + a*1000;
			} else if(a==b && a!=c) {
				money = 1000 + a*100;
			} else if(a==c && a!=b) {
				money = 1000 + a*100; 
			} else if(b==c && b!=a) {
				money = 1000 + b*100;
			} else if(a!=b && a!=c && b!=c) {
				int max = a;
				if(b>max) max = b;
				if(c>max) max = c;
				money = max*100;
			}			
			prize[tc] = money;
			
			if(prize[tc] >= maxMoney) {
				maxMoney = prize[tc];
			}
		}

		System.out.println(maxMoney);
	}

}
