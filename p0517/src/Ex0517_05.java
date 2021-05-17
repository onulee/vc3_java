
public class Ex0517_05 {

	public static void main(String[] args) {
		
		String str = new String();
		//객체선언 또는 객체생성
		Tv t = new Tv();
		t.channel=7;
		System.out.println(t.channel);
		System.out.println(t.power);
		t.power();
		t.channelDown();
		System.out.println("power후 : "+t.power);
		System.out.println("down후 : "+t.channel);
		
		
		
		
		
	}
}
