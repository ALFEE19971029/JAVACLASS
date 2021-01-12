package step3_01.arrayAdvance1;

// 배열의 주소

public class ArrayEx33 {

	public static void main(String[] args) {
		
		int[] arr = { 87, 100 , 24 ,11 ,79};
		
		int[] temp = arr;
		temp[1] = 0;
		arr[2]  = 0;
		
		System.out.println(arr);
		System.out.println(temp);
		
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		

	}

}
