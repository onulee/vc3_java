
public class Ex0518_01 {

	int a;
	String b;
	
	public static void main(String[] args) {
		
		Time[] t = new Time[3];
		for(int i=0;i<t.length;i++) {
			t[i] = new Time();  //객체선언
			t[i].hour = i+1;
			t[i].minute = i+1;
			t[i].second = i+1;
		}
		
		for(int i=0;i<t.length;i++) {
			System.out.printf("%d시%d분%d초 \n",t[i].hour,t[i].minute,t[i].second);
		}
		
		
		
//		Time t = new Time();
//		
//		int hour = 1;
//		System.out.println(hour);
//		
//		t.hour = 1;
//		t.minute = 1;
//		t.second = 1;
//		
//		System.out.println(t.hour+"시"+t.minute+"분"+t.second+"초");
//		
//		

	}

}
