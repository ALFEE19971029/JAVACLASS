package step5_01.exception;


/*
 * 
 * # finally 
 * 
 * - 예외발생과 상관없이 무조건 실행할 문장을 적는다.
 * - 주로 외부모듈과의 컨넥션을 종료할 때 사용한다.
 * 
 * */

public class ExceptionEx02 {

	public static void main(String[] args) {

		
		try {
			
			int[] testArr = new int[5];

			System.out.println(testArr[0]);
			//System.out.println(testArr[90]);
			//System.out.println(testArr[0]/0);
			
		} catch (Exception e) {
			System.out.println("Exception 클래스는 모든 에러 클래스의 조상");
		} finally {
			System.out.println("예외발생과 상관없이 무조건 실행할 문장을 적는다.");
			System.out.println("주로 외부모듈과의 컨넥션을 종료할 때 사용한다.");
		}	
			
		
	}

}
