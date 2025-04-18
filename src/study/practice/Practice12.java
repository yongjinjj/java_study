package study.practice;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		※규칙을 찾아보고 작성
		1) 반복문 1개로 결과 만들기
		2)반복문 2개 중첩해서 결과만들기

		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
		12345
		12345
		12345
		12345
		12345

		//2.
		11111
		22222
		33333
		44444
		55555
		*/
		
		//1. 1)
		for(int i=1; i<=5; i++) {	//5회 반복
			System.out.println("12345");
		}
		
		
		//2. 1)
		for(int i=1; i<=5; i++) {	//5회 반복
			System.out.println(""+i+i+i+i+i);		// 11111
												// 22222
		}
		
		for(int i=1; i<=5; i++) {	//5회 반복
			System.out.println(11111 * i); 
		}
		
		for(int i=11111; i<=55555; i=i+11111) {	//5회 반복
			System.out.println(i); 
		}
		
		//1. 2)
		for(int i=1; i<=5; i++) {	//5회 반복 (5줄 행)
			
			for(int j=1; j<=5; j++) { //j 출력에 참여
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*
			i: 1
			j: 1 2 3 4 5
			
			i: 2
			j: 1 2 3 4 5
			
			i: 3
			j: 1 2 3 4 5
			
			i: 4
			j: 1 2 3 4 5
			
			i: 5
			j: 1 2 3 4 5
		 */
		
		//2. 2)
		for(int i=1; i<=5; i++) {	// i가 출력에 참여
			
			for(int j=1; j<=5; j++) {	//5회 반복
				System.out.print(i);
			}
			System.out.println();
		}
		
		/*
			i: 1 1 1 1 1
			j: 1 2 3 4 5
			
			i: 2 2 2 2 2 
			j: 1 2 3 4 5
			
			i: 3 3 3 3 3 
			j: 1 2 3 4 5
			
			i: 4 4 4 4 4
			j: 1 2 3 4 5
			
			i: 5 5 5 5 5
			j: 1 2 3 4 5
		 */
	
		
	}

}
















