
public class Card {
	
	String[] kinds= {"","SPADE","DIAMOND","HEART","CLOVER"};
	String[] numbers= {"0","1","2","3","4","5","6","7","8","9","10",
			           "J","Q","K"};
	
	int kind; //SPADE,DIAMOND,HEART,CLOVER
	int number;
	
	Card(){
		this(1,1);
	} //기본생성자
	
	Card(int kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	//카드출력
	void card_print(int kind,int number) {
		System.out.printf("카드종류 : %s,%s \n",kinds[kind],numbers[number]);
	}

}
