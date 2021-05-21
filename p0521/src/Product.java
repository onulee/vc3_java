
public class Product {
	
	static int count;  //클래스변수
	int serialNo;      //인스턴스 변수
	String product_name;
	int price; //가격
	int bonusPoint;
	
	{  //인스턴스 초기화블럭
		serialNo = ++count;
	}
	
	Product(){ //생성자
	}
	
	Product(String product_name,int price){ //생성자
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = price/100;
	} 
	Product(String product_name,int price,int bonusPoint){ //생성자
		this.product_name = product_name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	} 
	
	

}
