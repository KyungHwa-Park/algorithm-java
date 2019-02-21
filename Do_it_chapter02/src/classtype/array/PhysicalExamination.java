package classtype.array;

// 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
public class PhysicalExamination {

	public static void main(String[] args) {
		
		// 클래스형 배열 생성 및 초기화
		PhyscData[] pData = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8)
		};
		
		// 시력 분포 통계용 배열 생성 
		int[] vdist = new int[VMAX];
		
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름	키	시력");
		System.out.println("---------------------");
		for(int i=0; i<pData.length; i++) {
			System.out.printf("%s	%3d	%.1f\n", 
						pData[i].name, pData[i].height, pData[i].vision);
		}
		System.out.println();
		System.out.printf("평균 키 : %.1f cm\n", aveHeight(pData));
		System.out.println();
		
		distVision(pData, vdist);
		System.out.println("시력 분포");
		for(int i=0; i<vdist.length; i++) {
			System.out.printf("%3.1f~ :%2d명\n", i/10.0, vdist[i]);
		}
	}

	
	static final int VMAX = 21; // 시력분포(0.0에서 0.1단위로 21개)
	
	static class PhyscData {
		// field
		String 	name;		// 이름
		int 	height;		// 키
		double 	vision;		// 시력
		
		// constructor
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}

	// 키의 평균값을 구하는 메서드
	static double aveHeight(PhyscData[] pData) {
		double sum = 0.0;
		for(int i=0; i<pData.length; i++) {
			sum += pData[i].height;
		}
		return sum/pData.length;
	}
	
	// 시력 분포를 구하는 메서드
	static void distVision(PhyscData[] pData, int[] dist) {
		int i = 0;
		dist[i] = 0;
		for(i=0; i<pData.length; i++) {
			if(pData[i].vision>=0 && pData[i].vision < VMAX/10.0) {
				dist[(int)(pData[i].vision*10)]++;
			}
		}
	}
}
