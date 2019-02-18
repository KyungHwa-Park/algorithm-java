package array.reverse.exercise;

// Q2. 배열의 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.
public class ReverseArrProcess {

	public static void main(String[] args) {
		
		// 초기 배열 선언, 초기화 및 출력
		int[] arr = {5, 10, 73, 2, -5, 42};
		System.out.print("초기 배열 : ");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		// 정의한 역순 정렬 메서드 호출
		reverse(arr);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	static int[] swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		return arr;
	}
	
	// 역순으로 정렬하는 과정을 하나하나 출력하는 메서드 정의
	static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			System.out.printf(
					"%d차 교환 : a[%d]와 a[%d]를 교환합니다.\n", 
					i+1, i, arr.length-1-i);
			swap(arr, i, arr.length-1-i);
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

}
