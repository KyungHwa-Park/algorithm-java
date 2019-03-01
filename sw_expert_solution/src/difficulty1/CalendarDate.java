package difficulty1;

import java.util.Scanner;

public class CalendarDate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            int date = sc.nextInt();
            int year = date/10000;
            date %= 10000;
            int month = date/100;
            int day = date %= 100;
            int result = 0;
            
            if(month>12 || month<1) {
                result = -1;
            } else {
                 switch(month){
                	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    	if(day<1 || day>31) result = -1;
                    	break;
                	case 2:
                    	if(day<1 || day>28) result = -1;
                    	break;
                	case 4: case 6: case 9: case 11:
                    	if(day<1 || day>30) result = -1;
                    	break;
               	 }
            }
            if(result == -1) {
                System.out.printf("#%d %d\n", tc, result);
            } else {
                System.out.printf("#%d %04d/%02d/%02d\n", tc, year, month, day);
            }
        }
	}
}