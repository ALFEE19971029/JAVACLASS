package step1_03.operator;

/*
 * 	# 산술 연산자
 * 	( + , - , / , % , * )
 * 
 * 
 * */

public class OpEx01 {

	public static void main(String[] args) {

		System.out.println(10 + 3); // 덧셈
		System.out.println(10 - 3); // 뺄셈
		System.out.println(10 * 3); // 곱셈
		
		System.out.println(10 / 3); // 나눗셈
		System.out.println(10 % 3); // 나머지
		
		/*
		 * 
		 * [ 중요 ]
		 * 
		 * 정수 / 정수 = 정수
		 * 정수 / 실수 = 실수
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 실수
		 * 
		 * - 최소 1개 요소 이상 실수형태의 타입이어야 한다.
		 * - 프로그래밍 언어마다 조금씩 차이가 있다.
		 * 
		 * */
		
		System.out.println(10 / 3);
		System.out.println(10.0 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3.0);
		
		System.out.println((double)10 / (double)3);
		System.out.println((double)10 / 3);
		System.out.println(10 / (double)3);
		
		
	}

}
