package repeat.multiloop.exercise;

// Q13. 위쪽과 왼쪽에 더하는 수가 있는 덧셈표를 출력하는 프로그램을 작성하세요.
public class Add99Table {

	public static void main(String[] args) {
		System.out.print("   |");
		for(int i=1; i<10; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("---+----------------------------");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%2d |", i);
			for(int j=1; j<10; j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}

	}

}
