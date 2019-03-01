package binary.library.object;

import java.util.Arrays;
import java.util.Scanner;

// 문자열의 배열에서 검색
public class StringBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Java에서 사용하는 키워드를 요소 값으로 갖는 배열
		String[] x = {
				"abstract", "assert", "boolean", "break", "byte", 
				"case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else", 
				"enum", "extends", "final", "finally", "float", 
				"for", "goto", "if", "implements", "import", 
				"instanceof", "int", "interface", "long", "native", 
				"new", "package", "private", "protected", "public", 
				"return", "short", "static", "strictfp", "super", 
				"switch", "synchronized", "this", "throw", "throws", 
				"transient", "try", "void", "volatile", "while" 
		};
		
		// 키 값을 입력받음
		System.out.print("원하는 키워드를 입력하세요 : ");	
		String keyword = sc.next();
		
		// 매개변수로 대상이 되는 배열(x)과 찾고자 하는 값(keyword)을 전달
		int idx = Arrays.binarySearch(x, keyword);
		
		if(idx<0) {
			System.out.println("해당 키워드가 없습니다.");
		} else {
			System.out.printf("해당 키워드는 x[%d]에 있습니다.\n", idx);
		}
	}

}
