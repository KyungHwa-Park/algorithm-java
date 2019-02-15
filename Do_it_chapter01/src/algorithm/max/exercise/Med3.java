package algorithm.max.exercise;

public class Med3 {

	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1));		// [A] a>b>c
		System.out.println("med3(3,2,2) = " + med3(3,2,2));		// [B] a>b=c
		System.out.println("med3(3,1,2) = " + med3(3,1,2));		// [C] a>c>b
		System.out.println("med3(3,2,3) = " + med3(3,2,3));		// [D] a=c>b
		System.out.println("med3(2,1,3) = " + med3(2,1,3));		// [E] c>a>b
		System.out.println("med3(3,3,2) = " + med3(3,3,2));		// [F] a=b>c
		System.out.println("med3(3,3,3) = " + med3(3,3,3));		// [G] a=b=c
		System.out.println("med3(2,2,3) = " + med3(2,2,3));		// [H] c>a=b
		System.out.println("med3(2,3,1) = " + med3(2,3,1));		// [I] b>a>c
		System.out.println("med3(2,3,2) = " + med3(2,3,2));		// [J] b>a=c
		System.out.println("med3(1,3,2) = " + med3(1,3,2));		// [K] b>c>a
		System.out.println("med3(2,3,3) = " + med3(2,3,3));		// [L] b=c>a
		System.out.println("med3(1,2,3) = " + med3(1,2,3));		// [M] c>b>a

	}

	static int med3(int num1, int num2, int num3) {
		if (num1 >= num2) {
			if (num2 >= num3) {
				return num2; // A,B,F,G
			} else if (num1 <= num3) {
				return num1; // D,E,H
			} else {
				return num3; // C
			}
		} else if (num1 > num3) {
			return num1; // I
		} else if (num2 > num3) {
			return num3; // J,K
		} else {
			return num2; // L,M
		}
	}
}
