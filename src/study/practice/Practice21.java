package study.practice;

public class Practice21 {

	public static void main(String[] args) {
		
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.

		int[][] arr = new int[4][4];
		
		/*
		1.
		1 2   3   4		(i*4) + (j+1)
		5 6   7   8
		9 10 11 12
		13 14 15 16
		 */
		
		int num = 1;
		for(int i=0; i<arr.length; i++) {			//i:0
			for(int j=0; j<arr[i].length; j++) {	//j:0 1 2 3 
				//arr[i][j] = num++;
				//num++;
				arr[i][j] = (4*i) + (j+1);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		/*
		2.
			1 5  9  13
			2 6 10 14
			3 7 11 15
			4 8 12 16
		 */
		System.out.println();
		
		num = 1;		
//		for(int i=0; i<arr.length; i++) {	//i:0
//			for(int j=0; j<arr[i].length; j++) {	//j:0 1 2 3
//				arr[j][i] = num++;
//			}
//		}
		
		for(int i=0; i<arr.length; i++) {	//i:0
			for(int j=0; j<arr[i].length; j++) {	//j:0 1 2 3
				arr[i][j] = (i+1) + (j*4);
			}
		}
		
//		for(int j=0; j<arr.length; j++) {	//j:0
//			for(int i=0; i<arr[j].length; i++) {	//i:0 1 2 3
//				arr[i][j] = num++;
//			}
//		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		/*
		3.
			16 15  14 13	  16 - (i*4) - j
			12 11  10  9			
			8   7   6  5
			4   3   2  1
		 */
		
		System.out.println();
		
//		num = 16;		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = num--;
//				//arr[i][j] = 16 - (i*4) - j;
//			}
//		}
		
		num = 1;		
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				arr[i][j] = num++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		/*
		4.
			16 12 8 4
			15 11 7 3
			14 10 6 2
			13 9  5  1
		*/
		System.out.println();
		
		num = 1;		
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				arr[j][i] = num++;
			}
		}
		// (16-i)-(4*j)
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
