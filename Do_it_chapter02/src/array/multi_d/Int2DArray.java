package array.multi_d;

// 2행 4열의 다차원 배열
public class Int2DArray {

	public static void main(String[] args) {
		int[][] x = new int[2][4];	// 2차원 배열을 선언
		
		x[0][1] = 37;				// 2차원 배열 x의 1행 2열에 37을 대입
		x[0][3] = 54;				// 2차원 배열 x의 1행 4열에 54을 대입
		x[1][2] = 65;				// 2차원 배열 x의 2행 3열에 65을 대입
		
		// 2차원 배열 x의 요소 값 출력
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.println("x["+i+"]["+j+"] = " + x[i][j]);
			}
		}

	}

}
