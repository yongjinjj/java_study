package study.practice.practice46;

import java.util.ArrayList;
import java.util.List;

//basecode
public class InterfaceType {
	public static void main(String[] args) {
		/*
		// 객체 생성
		Food f = new Food("족발", 19800);
		Electronics e = new Electronics("에어팟", 199000);
		Clothing c = new Clothing("셔츠", 49900);
		
		// 총합 계산
		int total = f.discountedPrice() + e.discountedPrice() + c.discountedPrice();
		*/
		
		List<Orderable> list = new ArrayList<Orderable>();
		list.add(new Food("족발", 19800));
		list.add(new Electronics("에어팟", 199000));
		list.add(new Clothing("셔츠", 49900));
		
		int total = 0;
		for(Orderable od : list) {
			total += od.discountedPrice();
		}
		
		// 결과 출력
		System.out.println("총합 : " + total + "원");
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. 10% */
	public int discountedPrice() {
		// 10000원 -> 10% 할인 -> 9000원	
		int result = (int)(price*0.9);
		
		result = (int)(price*9/10);
		result = (int)(price*90/100);
		result = price - (int)(price*0.1);
		result = price - (int)(price*1/10);
		
		return result;
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. 20% */
	public int discountedPrice() {
		return (int)(price*0.8);
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. 30% */
	public int discountedPrice() {
		return price - price*3/10;
	}
}