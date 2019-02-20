package array.dayOfyear.exercise;

import java.util.Scanner;

// Q8. 메서드 dayOfYear를 변수 i와 days 없이 구현하세요. while문을 사용하세요.
public class DayOfYearEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		System.out.println("그 해 경과 일 수를 구합니다.");
		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();
			
			int days = dayOfYear(year, month, day);
			System.out.println("그 해 " + days + "일 째 입니다.");
			System.out.println("한 번 더 할까요? (1.예/0.아니오) : ");
			retry = sc.nextInt();
			
			if(retry == 0) {
				System.out.println("경과 일 수 계산을 종료합니다.");
			}
		} while (retry == 1);
	}
	
	
	// 평년/윤년 1~12월 월 별 일 수
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},		// 평년
			{31,29,31,30,31,30,31,31,30,31,30,31}		// 윤년
	};
	
	// 매개변수 year의 평년or윤년 여부 (1:윤년, 0:평년)
	static int isLeap(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
	}
	
	// while문을 사용해 경과 일 수 구하는 메서드
	static int dayOfYear(int y, int m, int d) {
		while(--m !=0) {
			d += mdays[isLeap(y)][m-1];
		}
		return d;
	}
}
