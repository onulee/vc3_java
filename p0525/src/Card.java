
public class Card {
	
	String kind;  //spade,diamond,heart,clover 4개
	String number; //1,2,3,4,5,6,7,8,9,10,J,Q,K
	
	Card(){ //기본생성자
		this("SPADE","1"); //다른생성자 호출
	}
	
	Card(String kind,String number){
		this.kind = kind;
		this.number = number;
	}

}
