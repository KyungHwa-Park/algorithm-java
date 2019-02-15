package algorithm.max;

// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.
public class Max3Method {

	public static void main(String[] args) {
		
		System.out.println("max3(3,2,1) = " + max3(3,2,1));		// [A] a>b>c
		System.out.println("max3(3,2,2) = " + max3(3,2,2));		// [B] a>b=c
		System.out.println("max3(3,1,2) = " + max3(3,1,2));		// [C] a>c>b
		System.out.println("max3(3,2,3) = " + max3(3,2,3));		// [D] a=c>b
		System.out.println("max3(2,1,3) = " + max3(2,1,3));		// [E] c>a>b
		System.out.println("max3(3,3,2) = " + max3(3,3,2));		// [F] a=b>c
		System.out.println("max3(3,3,3) = " + max3(3,3,3));		// [G] a=b=c
		System.out.println("max3(2,2,3) = " + max3(2,2,3));		// [H] c>a=b
		System.out.println("max3(2,3,1) = " + max3(2,3,1));		// [I] b>a>c
		System.out.println("max3(2,3,2) = " + max3(2,3,2));		// [J] b>a=c
		System.out.println("max3(1,3,2) = " + max3(1,3,2));		// [K] b>c>a
		System.out.println("max3(2,3,3) = " + max3(2,3,3));		// [L] b=c>a
		System.out.println("max3(1,2,3) = " + max3(1,2,3));		// [M] c>b>a
		
	}
	
	// num1, num2, num3 중 최댓값을 구하여 반환하는 메서드
	public static int max3(int num1, int num2, int num3) {
		int max = num1;
		if(num2 > max) {
			max = num2;
		}
		if(num3 > max) {
			max = num3;
		}
		// 구한 최댓값을 호출한 곳으로 반환
		return max;		
	}

}
