package step1_06.loop;

/*
 * 
 * # 반복문 while
 * 
 * [ 형식 ]
 * 
 * 초기식;
 * while ( 조건식 ) {
 * 
 * 		조건식이 참일동안 실행할 명령어;
 *		증감식;
 *  
 * }
 * 
 * 
 * 
 * */



public class LoopEx01 {

	public static void main(String[] args) {

		System.out.println("반복문 시작");
		
		int i = 0;				// 초기식
		
		while ( i < 10 ) {		// 조건식
			
			System.out.println("명령어");
			
			i = i + 1; 			// 증감식  // i++;
			
		}
		
		System.out.println("반복문 종료");
	}

}
