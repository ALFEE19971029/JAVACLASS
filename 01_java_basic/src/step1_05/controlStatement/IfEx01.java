package step1_05.controlStatement;

import java.util.Scanner;

/*
 * 
 *  조건문 if
 * 
 *  - 조건식이 true이면 실행되는 구문
 *  - 조건식이 false이면 실행되지 않는다.
 *  
 *  [ 형식 ]
 *  
 *  if ( 조건식 ) {
 *  	명령어;
 *  }
 *  
 * 
 * */

public class IfEx01 {

	public static void main(String[] args) {
	
		if (true) {
			System.out.println("실행 O"); // if안 명령어는 tab으로 들여쓰기한다.
		}
		
		if (false) {
			System.out.println("실행 X");
		}
		
		int number = 10;
		
		if (number % 2 == 0) {
			System.out.println("짝수!");
			System.out.println("짝수일때 실행되는 명령어");
		}
		
		if (number % 2 == 1) {
			System.out.println("홀수!");
			System.out.println("홀수일때 실행되는 명령어");
		}
		
		
		int number2 = 7;		// if문 안의 명령어가 1줄이면 {}를 생략가능하다.
		if (number2 % 2 == 0)   System.out.println("짝수");
		if (number2 % 2 == 1)   System.out.println("홀수");
		
		
		
		
		
	}
	
}
