package study.practice.practice35;

import java.util.ArrayList;

public class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	//Menu[] menus;
	ArrayList<Menu> menuList;
	
	// 생성자
	/*
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}*/
	public Order(int i, ArrayList<Menu> menuList) {
		orderNum = i;
		this.menuList = menuList;
	}
	
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		
		//주문한 메뉴는 menus 
		//메뉴당 금액 menus -> Menu -> price
		int sum = 0;
		
		for(int i=0; i<menuList.size(); i++) {
			sum += menuList.get(i).price;
			//	   menuList.get(i) : i인덱스 위치에 있는 Menu 객체 .price
			//	   menus[i]		   : i인덱스 위치에 있는 Menu 객체 .price
		}
		
//		for(int i=0; i<menus.length; i++) {
//			sum += menus[i].price;
//		}
		
//		for(Menu menu : menus) {
//			sum += menu.price;
//		}
		
		return sum;
	}
}















