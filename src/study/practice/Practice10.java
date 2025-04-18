package study.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int lang = scanner.nextInt();
		System.out.print("수학점수 : ");
		int math = scanner.nextInt();
		System.out.print("영어점수 : ");
		int eng = scanner.nextInt();
		
		// 점수 총합 / 3 => 평균
		//int avg = (lang + math + eng) / 3;
		int total = lang + math + eng;	//총합
		double avg = (double)total / 3.0;
		
		if( lang >= 40 && math >= 40 && eng >= 40 && avg >= 60 ) {
			//합격
			System.out.println("국어 : " + lang);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			//System.out.println("합계 : " + (lang + math + eng));
			System.out.println("합계 : " + total);
			//System.out.println("평균 : " + avg);
			System.out.printf("평균 : %.2f\n", avg);
			System.out.println("축하합니다. 합격입니다!");
			
//			if(평균 >= 60) {
//				//합격
//			} else {
//				//불합격
//			}
			
		} else {
			//불합격
			System.out.println("불합격입니다.");
		}
		
		//	100				60			70			50
		if( lang < 40 || math < 40 || eng < 40 || avg < 60 ) {
			//불합격
		} else {
			//합격
		}
		
		
		
	}

}
















