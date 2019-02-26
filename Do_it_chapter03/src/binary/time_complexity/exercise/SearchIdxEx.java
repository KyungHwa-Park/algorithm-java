package binary.time_complexity.exercise;

import java.util.Scanner;
/*
 * Q3. 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
 * 일치한 요솟수를 반환하는 메서드를 작성하세요.
 */

public class SearchIdxEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 길이(요솟수)는? ");
		int num = sc.nextInt();
		int[] a = new int[num];
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d] : ", i);
			a[i] = sc.nextInt();
		}
		
		System.out.print("찾고자 하는 값 key는 ");
		int key = sc.nextInt();
			
		int[] idx = new int[a.length];
		int length = searchIdx(a, num, key, idx);
		
		if(length == 0) {
			System.out.println("찾고자 하는 값 key와 일치하는 요소가 없습니다.");
		} else {
			System.out.print("배열 a에서 요소 값이 key와 일치하는 위치를 저장한 배열 idx는 {");
			for(int i=0; i<length; i++) {
				if(i==length-1) {
					System.out.print(idx[i]);
				} else {
					System.out.print(idx[i] + ", ");
				}
			}
			System.out.print("}이고, 그 길이(요솟수)는 " + length + "입니다.");
		}
	}
	
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int length = 0;
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[length++] = i;
			}
		}
		return length;	
	}
}
