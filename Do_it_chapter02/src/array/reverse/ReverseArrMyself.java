package array.reverse;

// 배열의 요소를 역순으로 정렬
public class ReverseArrMyself {

	public static void main(String[] args) {

		int[] a = {22, 57, 11, 32, 91, 68, 70};
		int[] b = reverseArray(a);
		System.out.print("배열 a의 reverse 배열 b =");
		for(int i=0; i<b.length; i++) {
			System.out.printf(" %d", b[i]);
		}	

	}
	
	
	// 배열의 요소를 역순으로 정렬하는 메서드 by myself 
	static int[] reverseArray (int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		return arr;
	}
}
