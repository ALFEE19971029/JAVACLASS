package step3_01.arrayAdvance1;

import java.util.Arrays;

// 2차원 배열

public class ArrayEx34 {

	public static void main(String[] args) {
						
		int[][] arr = new int[2][4];
		
		System.out.println(arr[0]);  // 주소값
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		
		System.out.println(arr[1]);  // 주소값
		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		arr[1][3] = 80;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		int[] temp = arr[1]; // 배열 1줄의 주소값 대입
		System.out.println(Arrays.toString(temp));
		
		// 배열의 요소를 간편하게 확인하는 방법
		// Arrays.toString(배열이름);
		
		
		
	}

}
