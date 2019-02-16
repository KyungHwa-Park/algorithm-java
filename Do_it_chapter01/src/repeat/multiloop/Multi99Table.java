package repeat.multiloop;

// 곱셈표를 출력합니다.
public class Multi99Table {

	public static void main(String[] args) {

		System.out.println("	----- 곱셈표 -----");
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
//				System.out.print(i * j + " ");
				// 출력서식 %3d : 전체자리수가 3인 정수
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}

	}

}
