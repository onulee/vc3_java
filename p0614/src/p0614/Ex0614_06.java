package p0614;

public class Ex0614_06 {

	public static void main(String[] args) {
		PlayingCard pc = new PlayingCardImpl();
		String kind = pc.getCardKind();
		System.out.println("카드의 종류 :" +kind);

	}

}
