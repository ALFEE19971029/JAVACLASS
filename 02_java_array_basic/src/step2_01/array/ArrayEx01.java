package step2_01.array;


/*
 * 
 *  # 배열 ( array )
 * 
 *  - '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
 *  - 인덱스(index) : '0'부터 시작하는 방 번호가 부여된다.
 *  - 배열은 주소 변수이다. 
 * 
 *  [ 형식 ]
 *  
 *  1) 자료형[] 배열명 = new 자료형[방의개수];
 *  2) 자료형 배열명[] = new 자료형[방의개수];
 * 
 * 
 * */

public class ArrayEx01 {

	public static void main(String[] args) {

		//@) 일반변수
		int nVar = 0;
		nVar     = 10;
		
		//1) 배열 생성방법
		int[] arr1    = null;
		arr1 = new int[5];   // 5개의 공간을 할당
		System.out.println(arr1);
		
		String[] arr2 = null;
		arr2 = new String[3]; // 3개의 공간을 할당
		System.out.println(arr2);
		
		double[] arr3 = null;
		arr3 = new double[7]; // 7개의 공간을 할당
		System.out.println(arr3);
		
		// 2) 배열의 요소값 확인
		System.out.println(arr1[0]); // 초깃값이 셋팅되어 있다.
		System.out.println(arr1[1]); // 정수타입의 초기값은 0이고 , 나머지는 직접 확인해보자.
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		// 3) 배열의 요소값 수정
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		System.out.println();
		
		System.out.println(arr1[0]); 
		System.out.println(arr1[1]); 
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		
		System.out.println();
		
		for (int i=0; i<5; i++) {
			System.out.println(arr1[i]);
		}
		
		// 자주 발생하는 에러 : java.lang.ArrayIndexOutOfBoundsException
		// 배열의 범위를 초과한 것으로 혼자서 해결한다.
		// System.out.println(arr1[5]);
		
		
		// 4) 배열의 요소 삭제
		arr1[3] = 0; // 배열의 요소를 삭제하는 개념은 초깃값으로 돌려 놓는 것이다.
		arr1 = null; // 배열 전체 삭제
		
		
	}

}
