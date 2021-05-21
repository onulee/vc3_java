
public class Ex0521_04 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.product_name="OLED TV";
		p1.price=700;
		p1.bonusPoint=p1.price/100;
		Product p2 = new Product("냉장고",500);  //냉장고 500;
		Product p3 = new Product("세탁기",200,2);  //세탁기 200 2;
		
		System.out.println("p1 : "+p1.serialNo);  //1
		System.out.println("p1 : "+p1.product_name);  //OLED TV
		System.out.println("p1 : "+p1.price);  //700
		System.out.println("p1 : "+p1.bonusPoint);  //7
		
		System.out.println("p2 : "+p2.serialNo);  // 2
		System.out.println("p3 : "+p3.serialNo);  // 0
		
		System.out.println("전체count : "+Product.count+" 개"); //3

	}

}
