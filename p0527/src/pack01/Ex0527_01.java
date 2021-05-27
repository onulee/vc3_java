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
