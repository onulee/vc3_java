
public class Ex0524_06 {

	public static void main(String[] args) {
		Deck d = new Deck(); //52장 Card -> 1-13,1-4
		//0번부터 5번까지 6장의 카드를 출력해보세요.
		d.shuffle(); //카드섞기 메소드
		
		for(int i=0;i<1;i++) {
			for(int j=0;j<6;j++) {
				d.c[13*i+j].card_print(i+1, j+1);
			}
		}
		

	}

}
