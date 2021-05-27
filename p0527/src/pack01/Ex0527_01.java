package pack01;

import java.util.Scanner;

public class Ex0527_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer();
		
		while(true) {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. 맥북노트북 구매");
			System.out.println("2. 아이폰 구매");
			System.out.println("3. OLEDTV 구매");
			System.out.println("4. 구매목록 보기");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1: //맥북노트북 구매
				b1.buy(new Computer());
				b1.myInfo();
				break;
			case 2: //아이폰 구매
				b1.buy(new SmartPhone());
				b1.myInfo();
				break;
			case 3: //OLEDTV 구매
				b1.buy(new Tv());
				b1.myInfo();
				break;
			case 4: //구매목록 보기
				String product_list=""; 
				for(int i=0;i<b1.list.size();i++) { //크기
					Product p = (Product) b1.list.get(i); //Object o.pro_name
					product_list = product_list + p.getPro_name()+" ";
					// 상품이름 pro_name
					//product_list = product_list + b1.cart[i].getPro_name()+" ";
				}
				System.out.println("총구매 목록 개수 : "+b1.list.size());
				System.out.println("구매 목록 : "+product_list);
				
//				for(int i=0;i<b1.getCount();i++) {
//					product_list = product_list + b1.cart[i].getPro_name()+" ";
//				}
//				System.out.println("총구매 목록 개수 : "+b1.getCount());
//				System.out.println("구매 목록 : "+product_list);
				b1.myInfo();
				
				break;
			}
			
		}
		
		
		
//		Product p = new Product();
//		System.out.println("제품 이름을 입력하세요.>>");
//		String name = scan.next();
//		p.price =10;
//		p.setPrice(10);
//		System.out.println(p.price);
//		System.out.println(p.getPrice());
//		
//		p.setPro_name(name);
//		System.out.println(p.getPro_name());
//		//p.price = 100;
//		p.setPrice(100);
//		System.out.println(p.getPrice());
//		p.setBonusPoint(50);
//		System.out.println(p.getBonusPoint());

	}

}
