package array.dayOfyear;

import java.util.Scanner;

// 그 해 경과 일수를 구함
public class DayOfYear {

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
	
	
	// 평년, 윤년에 따른 각 월의 일 수 
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},	// 평년 1~12월 각 월 days
			{31,29,31,30,31,30,31,31,30,31,30,31}	// 윤년 1~12월 각 월 days
	};
	
	// 매개변수로 받은 year의 평년/윤년여부 판단 (1:윤년, 0:평년)
	static int isLeap(int year) {
		return (year % 4 ==0 && year%100 !=0 || year%400 == 0) ? 1 : 0;
	}
	
	// 연(y), 월(m), 일(d)을 매개변수로 받아 경과 일 수를 계산하는 메서드
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
//		if(isLeap(y) == 0) {		// 평년
//			for(int i=0; i<m-1; i++) {
//				days += mdays[0][i];
//			}
//			System.out.println(y+"년은 평년입니다.");
//		} else {				// 윤년
//			for(int i=0; i<m-1; i++) {
//				days += mdays[1][i];
//				System.out.println(y+"년은 윤년입니다.");
//			}
//		}
		
		for(int i=0; i<m-1; i++) {
			days += mdays[isLeap(y)][i];
		}
		
		return days;
	}
}
