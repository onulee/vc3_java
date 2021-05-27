package pack01;

public class Buyer {
	
	private String member_id;
	private String member_pw;
	private String name;
	private int money=2000;
	private int bonusPoint;
	
	private int count=0;
	Product[] cart = new Product[10]; //구매목록 저장변수 배열
	
	//구매 메소드 -> 물품가격 차감, 보너스포인트 추가 
	void buy(Product p) { //다형성:부모의 참조변수로 자손의 객체를 다루는 것
		money = money - p.getPrice(); // 제품가격을 차감
		// money = money - t.price
		bonusPoint = bonusPoint + p.getBonusPoint(); //보너스포인트 추가
		//bonusPoint = bonusPoint + t.bonusPoint
		System.out.println(p.getPro_name()+" 구매하였습니다.");
		cart[count++] = p; //pro_name,price,bonusPoint
	}
	
	void myInfo() {
		System.out.println("보유금액 : "+money);
		System.out.println("보너스포인트 : "+bonusPoint);
	}
	
	

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
	

}
