import java.util.Scanner;

public class Ex0525_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); //52장 카드생성후 kind,number입력완료
		
		//무한반복
		loop1:while(true) {
			d.menu_print();  //메뉴 출력
			int choice = scan.nextInt();  //번호선택
			
			switch(choice) {
			case 1: //카드 1장 출력
				System.out.println("카드번호를 입력하세요.(0-51)>>");
				int num = scan.nextInt();
				d.print_1card(num);
				break;
			case 2://카드 5장 출력
				d.print_5card();
				break;
			case 3:
				d.print_52card();
				break;
			case 4:
				d.shuffle();
				break;
			case 5:
				// 카드7장을 내것과 컴퓨터 것을 출력시키는 메소드를 작성해보세요.
				// MYCARD : SPADE,1 HEART,9 ...
				// 컴퓨터CARD : SPADE,J  DIAMOND,K ...
				d.handOut7card();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
			
			
		}

	}

}
