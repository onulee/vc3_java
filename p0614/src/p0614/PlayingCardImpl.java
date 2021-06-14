package p0614;

public class PlayingCardImpl implements PlayingCard {

	@Override
	public String getCardKind() {
		System.out.println("카드 종류를 리턴합니다.");
		return KIND;
	}

}
