package study.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		//prac1();
		//prac2v1();
		//prac2v2();
		//prac3v1();
		//prac3v2();
		prac4();
	}

	public static void prac1() {
		/*
			1.
			두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
			모든 경우의 수를 출력하는 프로그램을 작성하시오.
			
			1 2 3 4 5 6 값 주사위 2개
			
			1 5
			2 4
			3 3
			4 2
			5 1
			첫번째 주사위 값 : x
			두번째 주사위 값 : y
			x + y = 6
		 */
		
		for(int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				if(x + y == 6) {
					System.out.println("x:" + x + " y:" + y);
				}
			}
		}
		
		
	}
	
	public static void prac2v1() {
		
		/*
		
		2.
		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		1) Math.random() 활용
		2) int[] lotto = new int[6]; 활용
		 
		 */
		
		//랜덤값 생성
		
		Random random = new Random();
		//System.out.println(random.nextInt(5));	//0 1 2 3 4 
		//System.out.println(random.nextInt(1, 5));	//1 2 3 4 			1<=랜덤값<5	jdk17~
		
		//1~6
		//System.out.println(random.nextInt(6)+1); //0 1 2 3 4 5  -> 1 2 3 4 5 6
		
		//System.out.println(   (int)(Math.random() * 6) + 1  );
		
		// 1 ~ 6	(int)(Math.random() * 6) + 1
		// 40 ~ 60  (int)(Math.random() * 21) + 40
		
		//   (int)(Math.random() * 숫자의 갯수) + 시작숫자
		
		
		
		int[] lotto = new int[6];	//로또 6개 값 저장용 배열변수
		
		int num; //뽑은 숫자 임시 저장
		int index = 0; //배열의 위치를 나타내는 인덱스
		boolean isDuplicated = false;
		
		// 6개의 로또번호 뽑는 과정
		while(true) {
			
			//랜덤값 뽑기
			num = (int)(Math.random() * 45) + 1 ;
			
			isDuplicated = false; //중복여부 사전 false로 초기화
			
			//중복이냐?  true -> 중복O   false -> 중복X
			for(int i=0; i<index; i++) {
				if(lotto[i] == num) {	//내가 뽑은 값이랑 중복된 값이 있는가?
					
					//true 실행 -> 중복된 값이 있다
					//중복이다!! 기록!!!
					isDuplicated = true;
					break;
				}
			}
			// 1 2 5 6 7 1
			
			/*
			if(isDuplicated) { //중복이면 pass

			} else { //중복 아니면? lotto 배열에 저장하면서 계속 진행
				
			}
			*/
			
//			if(isDuplicated == false) {
//				 
//			}
			
			if(isDuplicated)
				continue;
			
			//중복아닐때 수행할 코드
			lotto[index] = num;
			index++; //다음칸으로 이동
			
			//6개 다 채웠으면? 끝!
			if(index >= lotto.length)
				break;
		}
		
		// 6개 뽑힌 번호 출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
				
		
		
		/*
		// 6개의 로또번호 뽑는 과정
		for(int i=0; i<6; i++) {
			//lotto[i] = random.nextInt(45)+1; //1~45
			lotto[i] = (int)(Math.random() * 45) + 1 ;
		}
		
		
		// 6개 뽑힌 번호 출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
		*/
		
		
		
	}
	
	public static void prac2v2() {
		
		int[] lotto = new int[6];	//로또 6개 값 저장용 배열변수
		
		int num; //뽑은 숫자 임시 저장
		int index = 0; //배열의 위치를 나타내는 인덱스
		boolean isDuplicated = false;
	
		// 6개의 로또번호 뽑는 과정
		for(int i=0; i<6; i++) {
			//i: 2
			lotto[i] = (int)(Math.random() * 45) + 1 ;
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		// 6개 뽑힌 번호 출력
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
	
	public static void prac3v1() {
		/*
		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		(*가능한 효율적인 구조를 생각해보세요)
		
		ex)
		1반 : 10 10 10 10 10
		2반 : 20 20 20 20 20
		3반 : 30 30 30 30 30
		
		1반 평균 : 10
		2반 평균 : 20
		3반 평균 : 30
		전체 평균 : 20
		 */
		Scanner scanner = new Scanner(System.in);
		
		int[][] scores = new int[3][5];
		//	ㅁㅁㅁㅁㅁ
		//	ㅁㅁㅁㅁㅁ
		//	ㅁㅁㅁㅁㅁ
		
//		int cls1stu1 = scanner.nextInt();
//		int cls1stu2 = scanner.nextInt();
//		int cls1stu3 = scanner.nextInt();
//		int cls1stu4 = scanner.nextInt();
//		int cls1stu5 = scanner.nextInt();
//		
//		int cls2stu1 = scanner.nextInt();
//		int cls2stu2 = scanner.nextInt();
//		int cls2stu3 = scanner.nextInt();
//		int cls2stu4 = scanner.nextInt();
//		int cls2stu5 = scanner.nextInt();
		

		int[] scores1 = new int[5];
		int[] scores2 = new int[5];
		int[] scores3 = new int[5];
		
		System.out.print("1반 : ");
		for(int i=0; i<scores1.length; i++) {
			scores1[i] = scanner.nextInt();
		}
		
		System.out.print("2반 : ");
		for(int i=0; i<scores2.length; i++) {
			scores2[i] = scanner.nextInt();
		}
		
		System.out.print("3반 : ");
		for(int i=0; i<scores3.length; i++) {
			scores3[i] = scanner.nextInt();
		}
		
		//1반평균  5명점수합/5
		//2반평균  5명점수합/5
		//3반평균  5명점수합/5
		//전체 평균 15점수합/15     1반평균+2반평균+3반평균/3
		
		int[] totals = new int[3];
		// 0 : 1반
		// 1 : 2반
		// 2 : 3반
		for(int i=0; i<scores1.length; i++) {
			totals[0] = totals[0] + scores1[i];
		}
		for(int i=0; i<scores2.length; i++) {
			totals[1] = totals[1] + scores2[i];
		}
		for(int i=0; i<scores3.length; i++) {
			totals[2] = totals[2] + scores3[i];
		}
		
//		for(int i=0; i<5; i++) {
//			totals[0] = totals[0] + scores1[i];
//			totals[1] = totals[1] + scores2[i];
//			totals[2] = totals[2] + scores3[i];
//		}
		
		System.out.printf("1반 평균 : %.2f\n", totals[0] / 5.0);
		System.out.printf("2반 평균 : %.2f\n", totals[1] / 5.0);
		System.out.printf("3반 평균 : %.2f\n", totals[2] / 5.0);
		System.out.printf("전체 평균 : %.2f\n", (totals[0] + totals[1] + totals[2])/15.0 );
		
		//int total1
		//int total2
		//int total3
	}
	
	public static void prac3v2() {
		/*
		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		(*가능한 효율적인 구조를 생각해보세요)
		
		ex)
		1반 : 10 10 10 10 10
		2반 : 20 20 20 20 20
		3반 : 30 30 30 30 30
		
		1반 평균 : 10
		2반 평균 : 20
		3반 평균 : 30
		전체 평균 : 20
		 */
		Scanner scanner = new Scanner(System.in);
		
		int[][] scores = new int[3][5];
		//  0 123 4
		//0	ㅁㅁㅁㅁㅁ
		//1	ㅁㅁㅁㅁㅁ
		//2	ㅁㅁㅁㅁㅁ
		
		for(int i=0; i<scores.length; i++) {	//i: 0 1 2
			
			System.out.print((i+1) + "반 : ");
			
			for(int j=0; j<scores[i].length; j++) { //j: 0 1 2 3 4
				scores[i][j] = scanner.nextInt(); 
			}
		}
		
		int total = 0; //전체 총합
		int classTotal = 0; //한 반의 총합
		for(int i=0; i<scores.length; i++) {	//i: 0 1 2
			
			classTotal = 0;
			
			for(int j=0; j<scores[i].length; j++) { //j: 0 1 2 3 4
				classTotal = classTotal + scores[i][j];
			}
			
			System.out.printf("%d반 평균 : %.2f\n", (i+1), classTotal / 5.0);
			total += classTotal;
		}
		
		System.out.printf("전체 평균 : %.2f\n", total/15.0 );
		
	}
	
	
	public static void prac4() {
		/*
		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.

		ex)
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		이 주어지는 경우 최종 결과는
		10 20 30 60
		20 30 40 90
		30 40 50 120
		60 90 120 270
		*/
		
		int[][] arr =	{
							{10, 20, 30},
							{20, 30, 40},
							{30, 40, 50}
						};
		
		int[][] result = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				result[i][j] = arr[i][j];  //같은 인덱스 위치에 복사
				result[i][3] += arr[i][j]; //행의 마지막 열에 더하기   result[i][result[i].length-1] 
				result[3][j] += arr[i][j];//열의 마지막 행에 더하기
				result[3][3] += arr[i][j];//마지막 행 마지막 열 에 더하기
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				//System.out.print(result[i][j] + " ");				
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}

}





























