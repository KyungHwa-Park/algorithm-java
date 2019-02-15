package repeat.sum.exercise;

import java.util.Scanner;

// Q8. 가우스의 덧셈 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
public class GaussAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = n%2==0 ? (1+n)*(n/2) : (1+n)*(n/2) + (n/2+1);		
//		int sum = (1+n)*n/2;
		
		System.out.println(sum);
	}

}
