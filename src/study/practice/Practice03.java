package study.practice;

public class Practice03 {

	public static void main(String[] args) {
	
		/*
		1. 아래 1), 2) 에 맞게 풀이.
		int x = 10;
		int y = 4;
		___result = ___x/y;
		System.out.println(result);
	
		1) 결과가 2가 나오도록 작성하세요
		2) 결과가 2.5가 나오도록 작성하세요
		*/
		
		/*	
		int x = 10;
		int y = 4;

		// 10/4 = 2.5    10/4 = 2
		// 1)
		// int result = x/y;			// 	int / int -> int    			

		// 2)
		double result = (double)x/y;  	// double / int -> double
		System.out.println(result);
		*/
		
		/*
	
		2. 결과가 7.5가 나오도록 작성하세요
		double a = 3.5;
		double b = 4.7;
		double result = _______________;
		System.out.println(result);
		
		*/
		
		/*
		double a = 3.5;		//3.5 + 4 = 7.5
		double b = 4.7;	
		double result = a + (int)b;	//4.7 -> 4
		System.out.println(result);
		*/
		
		/*
	
		3. 계산결과가 12가 나오도록 작성하세요
		String a = "3.4";
		String b = "4";
		______ result = ________;
		System.out.println(result);
		*/
		
		/*
		String a = "3.4";		//String -> 숫자 3.4	-> 3
		String b = "4";			//String -> 숫자 4
		
		double doubleA = Double.parseDouble(a);	//"3.4" -> 3.4
		int intA = (int)doubleA;	// 3.4 -> 3
		
		int intB = Integer.parseInt(b);	// "4" -> 4
		
		int result = (int)Double.parseDouble(a) * Integer.parseInt(b) ;
		
		result = intA * intB;
		
		System.out.println(result);
		*/
		
		
		/*
	
		4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
		String a = "10";
		int b = 3;				// "10" -> 10 + 3 = 13
		double c = 4.5;			// 3 * 4 = 12    3 * 4.5 = 13.5  -> 13
		_____ result = _______;
		System.out.println(result);
		*/
		
		/*
		String a = "10";
		int b = 3;
		double c = 4.5;
		//String result = a + ( Integer.parseInt(a) + b ) ;	//"10" + ( 13 )
				//		"10" + 10 + 3
				//		   "1010"  + 3
				//		    "10103"
		String result = a + ( (int)(b*c)  ) ;
		//				"10" + 	(int)(13.5) -> 13
		
		System.out.println(result);
		*/
		
		/*
		5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
		int a = 4;
		double b = 3.4;
		String c = "6.8";
		_____ result = _______;
		System.out.println(result);
		*/
		
		/*
		int a = 4;			// "" + 2 + 4  + 3  = "243"
		double b = 3.4;		// 4*6 = String.valueof(24) + 3 = "243"
		String c = "6.8";
		
		//String result =  ( (int)Double.parseDouble(c) - a ) + String.valueOf(a) + (int)b;
						//                  6  - 4 = 2     + "4" + 3
		
		String result= "" + (a * (int)Double.parseDouble(c)) + (int)b;
		
		System.out.println("\"" + result + "\"");
		*/
		
		/*
		6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
		int x = 111;
		int y = 13;
		int result = _____;
		System.out.println(result);
	
		1) 출력결과 : 7
		2) 출력결과 : 8
		*/
		
		int x = 111;
		int y = 13;
		int result = x % y;	// 1)
		result = x / y;	// 2)		// int/int  -> 8 
		System.out.println(result);
	
		
	}

}
