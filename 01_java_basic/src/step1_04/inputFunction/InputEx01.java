package step1_04.inputFunction;

import java.util.Scanner;

/*
 * 
 * 콘솔창에 키보드로 데이터 입력받기
 * 
 *  [ 순서 중요 ]
 * 
 *  1) import java.util.Scanner;   				// Scanner 클래스를 불러온다.
 *  2) Scanner scan = new Scanner(System.in);   // scan변수를 생성한다.
 *  3) System.out.print("나이 입력: ");         // 안내문을 작성한다.
 *  4) int 변수 = scan.nextInt(); 				// 입력받은 값을 변수에 저장한다.
 *  5) scan.close();							// 종료
 * 
 * */

public class InputEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // 시작에서 한번만 생성하면 된다. ( 계속 생성할 필요 없다. )
		
		
		System.out.print("나이를 입력하세요: ");     // 입력커서가 우측에 생성 
		//System.out.println("나이를 입력하세요: "); // 입력커서가 한줄 아래에 생성
		int getAge = scan.nextInt(); // 숫자만 입력가능 ( 문자열을 후에 공부 )
		
		System.out.println("입력하신 나이는 " + getAge + "살 입니다.");
		System.out.println("내년 나이는 " + (getAge+1) + "살 입니다.");
		System.out.println("5년 뒤 나이는 " + (getAge+5) + "살 입니다.");
		
		
		
		scan.close(); // 코드의 맨마지막에 작성한다. 
		
		
		
	}

}
