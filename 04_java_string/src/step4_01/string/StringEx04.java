package step4_01.string;

/*
 * 
 * # 문자열 관련 형변환
 * 
 * 
 * */

public class StringEx04 {

	public static void main(String[] args) {
		
		// 1. 문자열 > 숫자 형변환
		
		int num = Integer.parseInt("10"); // Integer.parseInt("문자열") 메서드 사용
		
		
		// 2. 숫자 > 문자열 형변환
		
		// 2-1) + "" 사용
		String str1 = 12 + "";
		
		// 2-2) String.valueOf(숫자) 사용
		String str2 = String.valueOf(12);

		// 2-3) Integer.toString(숫자) 사용
		String str3 = Integer.toString(12);
		
	}

}




