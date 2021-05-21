
public class LottoBall {
	static int[] ball = new int[45];
	
	//생성자
	LottoBall() {
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		int temp=0;  //임시데이터저장변수
		int randomNum=0; //배열랜덤번호사용
		
		for(int i=0;i<200;i++) {
			randomNum = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[randomNum];
			ball[randomNum] = temp;
		}
	}
	
	//초기화블럭
//	static {
//		
//	}
	

}
