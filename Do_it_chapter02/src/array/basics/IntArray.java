package array.basics;

// 구성 요소의 자료형이 int형인 배열 (구성 요솟수는 5 : new에 의해 본체를 생성)
public class IntArray {

	public static void main(String[] args) {
		
		// int형 배열 생성
		// int형 배열의 구성 요소는 자동으로 0으로 초기화 됨
		int[] a = new int[5];
		
		// 배열 요소에 값 대입
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;

		// 배열 출력
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d] : ", i);
			System.out.println(a[i]);
		}
	}

}
