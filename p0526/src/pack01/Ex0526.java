package pack01;

public class Ex0526 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ctv = new CaptionTv();
		ctv.text="라라라~~~~";
		
		Tv t2 = new CaptionTv(); //다형성
		
		
		Tv tt=null;
		CaptionTv cctv=null;
		
		tt = cctv;  //자손 -> 조상 : 형변환생략
		cctv = (CaptionTv) tt; // 조상 -> 자손 갈때 형변환 필수 
		//조상의 참조변수,자손의 참조변수는 서로 교환가능
		
		
		//t = ctv; //다형성 : 조상의 참조변수로 자손의 객체를 다루는 것.
		// Tv t = new CaptionTv();
		
		//ctv = t; // 자손의 참조변수로 조상의 객체 다루는 것은 안됨.
		

	}

}
