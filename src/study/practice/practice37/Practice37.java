package study.practice.practice37;

import java.util.HashMap;
import java.util.HashSet;

public class Practice37 {

	public static void main(String[] args) {
	

	/*
		String str = "Returns a completion of the value and message";
							  
							  종류가
		1. 이 문장에 사용된 알파벳의 갯수는 몇개인가요?
		(중복된 수 제외, 대소문자 구분X)
		Ex) R r 둘다 구분하지 않고 알파벳 r 한개라고 체크
		
		2. 이 문장에 사용된 알파벳들이 각각 몇 글자씩 있는지 세어보고 출력하세요.
	*/
		
		//int n = 10;
		// 출력(n+10)
		// 출력(n++)
		
		String str = "Returns a completion of the value and message";
		
		System.out.println(str.charAt(15));
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);
		
		for(int i=0; i<str.length(); i++) {
			//str.charAt(i) -> char == ' '
			// char -> String  .equals
			if(str.charAt(i) != ' ')
				System.out.println(str.charAt(i));
		}
		
		System.out.println(str.replace(" ", ""));
		System.out.println(str);
		
		str = str.toLowerCase();	//소문자로
		str = str.replace(" ", ""); //띄어쓰기 제거
		
		System.out.println("문자열 자체의 길이 : " + str.length());
		
		
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		System.out.println("알파벳 종류의 수 : " + set.size());
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			
			map.put(c, map.getOrDefault(c, 0) + 1);
			
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
		}
		
		for(char key : map.keySet()) {
			System.out.println("알파벳:"+key + " 갯수:" + map.get(key));
		}
	}

}





















