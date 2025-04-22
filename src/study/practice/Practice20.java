package study.practice;

import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {
		//prac1();
		//prac2();
		//prac3();
		prac4();
		
	}
	
	public static void prac1() {
		/*
 		1.
			2x + 4y = 10 이 만족하는 모든 x, y 쌍을 구하시오.
			(x와 y는 자연수 1~10)
			
			2*x + 4*y = 10
			x:1   y:2
			x:3   y:1
		 */
		
		// x:1
		// y:1 2 3 4 5 6.... 9 10
		// x:2
		// y:1 2 3 4 5 6.... 9 10
		// ...
		// x:10
		// y:1 2 3 4 5 6.... 9 10
		
		
		//for(int x=1; 2*x<10; x++) {	//1~10   1~4
		//	for(int y=1; 4*y<10; y++) {
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				
				if( 2*x + 4*y == 10 ) {
					System.out.printf("x:%d y:%d\n", x, y);
//					System.out.printf("2*%d + 4*%d = %d\n", x, y, (2*x + 4*y));
				}
			}
		}
		
	}
	
	public static void prac2() {
		/*
		2.
		정수 2개를 입력 받아서,
		아래 계산 결과를 출력하시오.
		큰수 - 작은수
		
		30 10 = 30-10 = 20
		50 100 = 100 - 50 = 50
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 개의 정수 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 > num2) { //num1이 더 큼
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		} else {  //num2 이 더 큼   (num1 == num2)
			System.out.printf("%d - %d = %d\n", num2, num1, num2-num1);
		}
	}
	
	public static void prac3() {
	
		/*

		3.
			윷놀이 게임
			4개의 윷을 입력받고 결과를 출력하시오.
			(뒷도는 없습니다!)
			0 : 안 뒤집어진 상태
			1 : 뒤집어진 상태
			ex) 입력 0 0 1 0
			결과 도
			입력 0 1 0 1
			결과 개
			
			입력된 값을 모두 더하면 -> 뒤집어진 윷의 갯수!
			
			뒤집어진 수
			1 도
			2 개
			3 걸
			4 윷
			0 모
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int[] yutArr = new int[4];
		
		//전제조건 : 무조건 0 아니면 1 만 정상적으로 입력하는 상황이다!!
		System.out.print("윷 값 입력(1:뒤집어짐, 0:안뒤집어짐): ");
		for(int i=0; i<yutArr.length; i++) {
			yutArr[i] = scanner.nextInt();
		}
		
		//입력 값이 0 or 1 범위 안에서 입력이 되었는가?
		int sum = 0;
		for(int i=0; i<yutArr.length; i++) {
			sum = sum + yutArr[i];	// 0 + 0 + 1 + 1 
		}
		
		/*
		int sum = 0;
		
		for(int i=0; i<yutArr.length; i++) {
			yutArr[i] = scanner.nextInt();
			sum = sum + yutArr[i];
		}
		 */
		
		switch(sum){
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		//case 0:
		default:
			System.out.println("모");
			break;
		}
		
		
		/*
		int yut1 = 0;
		int yut2 = 0;
		int yut3 = 1;
		int yut4 = 0;
		
		if( (yut1==1&&yut2==0&&yut3==0&&yut4==0)
				||
			(yut1==0&&yut2==1&&yut3==0&&yut4==0)
				||
			(yut1==0&&yut2==0&&yut3==1&&yut4==0)
				||
			(yut1==0&&yut2==0&&yut3==0&&yut4==1)
			) {
			//도
		}
		*/
		
	}
	
	public static void prac4() {
		/*
		4. 입력받은 수 만큼 별 출력하기
			ex) 4
			****
			5
			*****
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 한개 입력 : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		int i=1;
		while(i<=num) {
			System.out.print("*");
			i++;
		}
		
		
	}


}











