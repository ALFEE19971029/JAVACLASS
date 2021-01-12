package step1_05.controlStatement;

/*
 * 
 *  # if ~ else문
 *  
 *  [ 형식 ]
 *
 *   if ( 조건식 ) {
 *       조건식이 true일 경우 실행할 명령어
 *   }
 *   else {
 *   	조건식이 false일 경우 실행할 명령어
 *   }
 * 
 *   - if없이 else가 단독으로 올 수 없다.
 *   - else를 중복해서 여러번 사용할 수 없다.
 *   - else 뒤에는 조건식을 쓸수 없다.
 *   - if문과 else문 사이에는 명령어가 올 수 없다.
 * 
 * 
 * 	 # if ~ else if문
 * 
 * 	[ 형식 ]
 * 
 *  if (조건식) {
 *  	조건식이 true일 경우 실행할 명령어;
 *  }
 *  else if (조건식) {
 *  	위 조건식이 false일 경우 해당 조건식을 보고 실행할 명령어;
 *  }
 *  else if (조건식) {
 *  	위 조건식이 false일 경우 해당 조건식을 보고실행할 명령어;
 *  }
 *  
 *  - else if문 '다중 택일'로 참인 조건식을 만나면 
 *    이하 조건은 실행하지 않는다.
 *  - if문 없이 단독으로 사용할 수 없다.
 *  - else문과 같이 사용할 수 있지만 else문이 제일 아래에 위치해야 된다.
 *  - if문과 else if문 사이에는 명령어가 올 수 없다.
 *  
 *  
 * */

	


public class IfEx17 {

	public static void main(String[] args) {

		int finalScore = 61;
		
//		if (finalScore >= 60) {
//			System.out.println("합격");
//		}
//		
//		if (finalScore < 60) {
//			System.out.println("불합격");
//		}
		
		
		if (finalScore >= 60) { // 조건식이 true일때 실행할 명령어
			System.out.println("합격");
		} 
		else {					// 조건식 false일때 실행할 명령어
			System.out.println("불합격");
		}
		
		System.out.println();
		
		finalScore = 85;
		
		
		if (finalScore > 90) {
			System.out.println("A");
		}
		else if (finalScore > 80) {	// 처음 if의 조건식이 false일경우 실행할 명령어
			System.out.println("B");
		}
		else if (finalScore > 70) { // 위의 else if의 조건식이 false일경우 실행할 명령어
			System.out.println("C");
		}
		
			
		
	}

}
