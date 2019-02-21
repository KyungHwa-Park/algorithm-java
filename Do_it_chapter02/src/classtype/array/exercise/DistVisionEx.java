package classtype.array.exercise;

// Q10. 기호 문자 *를 사람 수만큼 반복해서 출력하여 시력 분포를 나타내는 프로그램을 작성하세요.
public class DistVisionEx {

	public static void main(String[] args) {
		// 클래스형 배열 생성 및 초기화
		PhyscData[] pData = { 
				new PhyscData("박현규", 162, 0.3), 
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0), 
				new PhyscData("홍연의", 171, 1.5), 
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박희영", 174, 1.2),
				new PhyscData("이철수", 174, 1.2),
				new PhyscData("박용규", 169, 0.8) 
		};
		
		// 시력 분포를 저장하는 배열 생성
		int[] vdist = new int[VMAX];

		// 기호 *를 사용하여 시력 분표 출력하는 메서드 호출
		distVision(pData, vdist);
	}

	
	// 시력 분포 (0.0에서 2.0까지 0.1씩 증가, 21단계)
	static final int VMAX = 21;

	// 신체 데이터 저장 클래스
	static class PhyscData {
		// field
		String name; // 이름
		int height; // 키
		double vision; // 시력

		// constructor
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	// 기호 *를 사용하여 시력 분표를 나타내는(출력하는) 메서드
	static void distVision(PhyscData[] pData, int[] vdist) {
		for (int i = 0; i < pData.length; i++) {
			if (pData[i].vision >= 0.0 && pData[i].vision < VMAX / 10) {
				vdist[(int) (pData[i].vision * 10)]++;
			}
		}
		for (int i = 0; i < vdist.length; i++) {
			System.out.printf("%3.1f ~ : ", i / 10.0);
			for (int j = 0; j < vdist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
