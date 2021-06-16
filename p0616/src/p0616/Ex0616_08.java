package p0616;

public class Ex0616_08 {

	public static void main(String[] args) {
		String[] hobby1 = { "movie","reading","golf"};
		
		//db저장하는 방법
		//1개의 데이터로 변경을 해야 합니다.
		// String hobby <- hobby1의 배열을 1개의 String으로 묶어서 저장해보세요.
		// "game,movie,reading,golf";
		
		String hobby="";
		for(int i=0;i<hobby1.length;i++) {
			if(i==0) {
				hobby+= hobby1[i];
			}else {
				hobby += ","+hobby1[i];
			}
			
		}
		
		System.out.println(hobby);
		
		if(hobby.contains("game")) {
			System.out.println("게임 checked 활성화");
			System.out.println("<input type='checkbox' name='hobby' value='game' checked>");
		}else {
			System.out.println("게임 checked 비활성화");
			System.out.println("<input type='checkbox' name='hobby' value='game'>");
		}
		
		
		
		
//		String[] s = new String[100];
//		for(int i=0;i<100;i++) {  //s0001,s0002,s0003
//			//s[i] = String.format("S%04d", i+1);
//			String temp = String.format("%04d", i+1);
//			s[i] = "s".concat(temp);  //문자와 문자를 결합 "S"+"0001"
//		}
//		for(int i=0;i<100;i++) {  //s0001,s0002,s0003
//			System.out.println(s[i]);
//		}

	}

}
