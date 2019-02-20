package array.primeNumber;

// 1000이하의 소수를 열거
// 소수 탐색 ver.2 : 2부터 n-1까지의 어떤 소수로도 나누어떨어지지 않습니다.
public class PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0;				// 나눗셈의 횟수
		int ptr = 0;				// 판별한 소수의 개수를 저장하는 변수
		int[] prime = new int[500];	// 소수를 저장하는 배열
		
		prime[ptr++] = 2;			// prime[0]에 2(소수)를 저장하고 ptr을 1 올림
		
		for(int n=3; n<=1000; n+=2) {	// 홀수만 판별! 왜냐면 짝수는 2로 나누어 떨어지므로 이미 소수가 아님
			int i;
			for(i=1; i<ptr; i++) {		// prime배열의 마지막 인덱스 : ptr-1
				counter++;
				if(n%prime[i] == 0) {	// 소수로 나누어 떨어지면 소수가 아님.
					break;				// 더 이상의 반복은 불필요
				}
			}
			if(ptr == i) {				// 마지막까지 나누어 떨어지지 않음
				prime[ptr++] = n;		// 소수이기 때문에 배열에 저장하고 ptr 1만큼 증가
			}
		}
		
		for(int i=0; i<ptr; i++) {		// 찾은 ptr개의 소수를 출력
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);

	}

}
