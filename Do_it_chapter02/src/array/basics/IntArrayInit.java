package array.basics;

// 구성 자료형이 int형인 배열(구성 요솟수는 5 : 배열 초기자에  의해 생성)
public class IntArrayInit {

	public static void main(String[] args) {
		// 배열 초기자에 의해 생성
		int[] a = {1,2,3,4,5};
		
		// 배열 출력
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
