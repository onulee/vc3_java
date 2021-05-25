
public class Deck {
	//52장의 카드생성
	//52장의 카드에 kind,number
	//52장를 섞는 메소드
	//52장의 카드를 출력하는 메소드
	String[] kinds= {"SPADE","DIAMOND","HEART","CLOVER"};
	String[] numbers= {"1","2","3","4","5","6","7","8","9","10",
			           "J","Q","K"};
	
	Card[] c = new Card[52]; //52장의 카드생성
	Card[] myCard = new Card[7];
	Card[] comCard = new Card[7];
	
	Deck() { //기본생성자 13*i+j - 모양,숫자 넣기
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[13*i+j] = new Card(kinds[i],numbers[j]);
				//c[0]  SPADE,1  SPADE,2  SPADE,3....
			}
		}
	}//Deck
	
	//섞기 메소드
	void shuffle() {
		for(int i=0;i<1000;i++) {
			int random_no = (int)(Math.random()*52); //0-51
			Card temp = c[0];
			c[0] = c[random_no];
			c[random_no] = temp;
		}
	}
	
	//1장 카드출력
	void print_1card(int index) {
		System.out.printf("카드 : %s, %s \n",c[index].kind,
				c[index].number);
	}
	
	//5장 카드출력
	void print_5card() {
		System.out.println("[ 5장 출력 ]");
		for(int j=0;j<5;j++) {
			System.out.printf("카드 : %s, %s \n",c[j].kind,
					c[j].number);
		}
	}
	
	
	//52장 카드출력
	void print_52card() {
		System.out.println("[ 52장 출력 ]");
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				System.out.printf("카드 : %s, %s \n ",c[13*i+j].kind,
						c[13*i+j].number);
			}
		}
	}
	
	// 7장 배분 메소드
	void handOut7card() {
		System.out.println("[ 7장씩 카드 배분 ]");
		for (int j = 0; j < 14; j++) {
			if (j <= 6) {
				myCard[j] = new Card(c[j].kind, c[j].number);
				System.out.printf("MY카드 : %s, %s\n ", myCard[j].kind, myCard[j].number);
			} else {
				comCard[j-7] = new Card(c[j].kind, c[j].number);
				System.out.printf("COM카드 : %s, %s\n ", comCard[j-7].kind, comCard[j-7].number);

			}

		}
	}

	//메뉴 출력
	void menu_print() {
		System.out.println("[ 카드 프로그램 ]");
		System.out.println("1.카드 1장 출력");
		System.out.println("2.카드 5장 출력");
		System.out.println("3.카드 52장 출력");
		System.out.println("4.카드 섞기");
		System.out.println("5.7장 배분");
		System.out.println("0.종료");
		System.out.println("-----------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}
	
	
	

	
	
}//class
