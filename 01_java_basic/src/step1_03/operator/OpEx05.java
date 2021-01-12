package step1_03.operator;

/*
 * 
 *   논리 연산자
 *   
 *   1) && (and) : 양쪽 모두다 참이어야 최종적으로 참(true)
 *   Ex) 무주택 세대주 이어야 '하고' 연봉이 3400미만이어야 한다.
 *   
 *   2) || (or) : 어느한쪽이라도 참이면 최종적으로 참(true)
 *   Ex) 무주택 세대주 '이거나' 연봉이 3400미만이어야 한다.
 *   
 *   
 *   3) !  (not) : 참을 거짓으로 , 거짓을 참으로 변환
 * 
 * 	[ 중요 ] 논리 연산자의 결과도 참(true) 또는 거짓(false)이다.
 * 
 * */

public class OpEx05 {

	public static void main(String[] args) {

		System.out.println(10 == 10 && 3 == 3); // 참 && 참 > 참
		System.out.println(10 != 10 && 3 == 3); // 거짓 && 참 > 거짓
		System.out.println(10 == 10 && 3 != 3); // 참 && 거짓 > 거짓
		System.out.println(10 != 10 && 3 != 3); // 거짓 && 거짓 > 거짓
		
		System.out.println();
		
		System.out.println(10 == 10 || 3 == 3); // 참 && 참 > 참
		System.out.println(10 != 10 || 3 == 3); // 거짓 && 참 > 참
		System.out.println(10 == 10 || 3 != 3); // 참 && 거짓 > 참
		System.out.println(10 != 10 || 3 != 3); // 거짓 && 거짓 > 거짓
		
		System.out.println();
		
		System.out.println(!(10 == 10)); // 참 > 거짓
		System.out.println(!(10 != 10)); // 거짓 > 참
		
		
	}

}
