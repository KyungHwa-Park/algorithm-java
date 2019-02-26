package difficulty1;

import java.util.Arrays;
import java.util.Scanner;

// 정렬 라이브러리 사용 ver.
public class IntermediateValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
       
        // 배열에 담기
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        
        // 정렬
        Arrays.sort(scores);
        
        // 중간값 출력
        System.out.println(scores[(n/2)]);

	}
}
