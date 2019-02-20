package array.dayOfyear.exercise;

import java.util.Scanner;

// Q9. y년 m월 d일의 그 해 남은 일 수(12월 31일이면 0, 12월 30일이면 1)를 구하는 메서드를 작성하세요.
public class LeftDayOfYear {

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
			
			int days = leftDayOfYear(year, month, day);
			System.out.println("그 해 남은 일 수는 " + days + "일 입니다.");
			System.out.println("한 번 더 할까요? (1.예/0.아니오) : ");
			retry = sc.nextInt();
			
			if(retry == 0) {
				System.out.println("남은 일 수 계산을 종료합니다.");
			}
		} while (retry == 1);
	}
	
	
	// 평년/윤년 1~12월 월 별 일 수
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},		// 평년
			{31,29,31,30,31,30,31,31,30,31,30,31}		// 윤년
	};
	
	// 윤년 검사 (1:윤년, 0:평년)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	// 남은 일 수 계산하는 메서드
	static int leftDayOfYear(int y, int m, int d) {
		// 방법 1. 평년 365, 윤년 366에서 경과 일 수 빼기
//		while(--m!=0) {
//			d += mdays[isLeap(y)][m-1];
//		}
//		return 365 + isLeap(y) - d;
		
		// 방법 2. 남은 일 수 계산
		int days = mdays[isLeap(y)][m-1] - d;
		for(int i=m; i<12; i++) {
			days += mdays[isLeap(y)][i];
		}
		return days;
	}
}
