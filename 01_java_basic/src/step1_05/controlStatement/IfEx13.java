package step1_05.controlStatement;

import java.util.Random;

/*
 * 
 * 랜덤 라이브러리 ( if와 관련 x )
 * 
 * */

public class IfEx13 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 0 ~ 9 사이의 랜덤값
		int rNum1 = ran.nextInt(10); 
		System.out.println(rNum1);
		
		// 0 ~ 6 사이의 랜덤값
		int rNum2 = ran.nextInt(7); 
		System.out.println(rNum2);

		// 10 ~ 100 사이의 랜덤값
		int rNum3 = ran.nextInt(91) + 10; 
		System.out.println(rNum3);
		
		// -3 ~ 3 사이의 랜덤값
		int rNum4 = ran.nextInt(7) - 3; 
		System.out.println(rNum4);
		
		
	}

}
