package study.practice;

public class Practice19 {

	public static void main(String[] args) {
		
		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
		//규칙 찾아보기.

		/*
		1 2 2 2 2
		3 1 2 2 2
		3 3 1 2 2
		3 3 3 1 2
		3 3 3 3 1
		*/
		
		//int[][] arr = { {1,2,2,2,2}, {3,1,2,2,2}, {3,3,1,2,2}, {3,3,3,1,2}, {3,3,3,3,1} };
		
		int[][] arr = new int[5][5];  //초기화 0 
		
		// 1  or 2 or 3 
		
		//					5
		for(int i=0; i<arr.length; i++) {//i: 0 1 2 3 4
			//					5
			for(int j=0; j<arr[i].length; j++) { //j:0 1 2 3 4
				if(i>j) {
					arr[i][j] = 3;
				} else if(i<j) {
					arr[i][j] = 2;
				} else {
					arr[i][j] = 1;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {//i: 0 1 2 3 4
			for(int j=0; j<arr[i].length; j++) { //j:0 1 2 3 4
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
